package OmniPaymentSystem;

public class Main {

    public static class PaymentAccount {

        // 🔐 Part 1: Encapsulation (Private Fields)
        private String accountID;
        private String accountHolder;
        private double balance;
        private String accountStatus;

        // ===========================
        // 🔹 Constructor 1 (Basic)
        // ===========================
        public PaymentAccount(String accountHolder) {
            this(accountHolder, 0.0); // constructor chaining
            this.accountID = "OP-" + (int)(Math.random() * 9000 + 1000) + "-2026";
        }

        // ===========================
        // 🔹 Constructor 2 (Standard)
        // ===========================
        public PaymentAccount(String accountHolder, double initialDeposit) {
            setAccountHolder(accountHolder);
            deposit(initialDeposit);
            this.accountStatus = "Active";
            this.accountID = "PENDING"; // default (can be updated later)
        }

        // ===========================
        // 🔹 Constructor 3 (CSV / Data Migrator)
        // ===========================
        public PaymentAccount(String rawData, boolean isCSV) {
            this(
                    rawData.split(",")[0].trim(),
                    Double.parseDouble(rawData.split(",")[1].trim())
            );
        }

        // ===========================
        // 🔹 Setter (Smart Name Formatting)
        // ===========================
        public void setAccountHolder(String name) {
            name = name.trim();
            String[] parts = name.split(" ");
            String result = "";

            for (String part : parts) {
                if (part.length() > 0) {
                    result += part.substring(0,1).toUpperCase() +
                            part.substring(1).toLowerCase() + " ";
                }
            }
            this.accountHolder = result.trim();
        }

        // ===========================
        // 🔹 ID Validation
        // ===========================
        public void setAccountID(String id) {
            if (id.startsWith("OP-") && id.endsWith("-2026") && id.length() == 12) {
                this.accountID = id;
            } else {
                this.accountID = "PENDING";
            }
        }

        // ===========================
        // 🔹 Deposit (Safe)
        // ===========================
        public void deposit(double amount) {
            if (amount > 0) {
                balance += amount;
            }
        }

        // ===========================
        // 🔹 Activate / Deactivate
        // ===========================
        public void activate() {
            accountStatus = "Active";
        }

        public void deactivate() {
            accountStatus = "Inactive";
        }

        // ===========================
        // 🔹 Part 4: Method Overloading
        // ===========================

        // 1. Standard USD
        public void processPayment(double amount) {
            if (amount > 0 && balance >= amount) {
                balance -= amount;
            }
        }

        // 2. Currency Conversion
        public void processPayment(double amount, String currencyCode) {
            if (currencyCode.equalsIgnoreCase("PKR")) {
                amount = amount / 280;
            } else if (currencyCode.equalsIgnoreCase("EUR")) {
                amount = amount * 1.1;
            }
            processPayment(amount);
        }

        // 3. Encrypted Entry
        public void processPayment(String encryptedEntry) {
            String[] parts = encryptedEntry.split(":");
            double amount = Double.parseDouble(parts[1]);
            processPayment(amount);
        }

        // ===========================
        // 🔹 Part 5: Masking Method
        // ===========================
        public String getAccountSummary() {
            String[] parts = accountHolder.split(" ");
            String masked = "";

            for (String part : parts) {
                if (part.length() > 0) {
                    masked += part.charAt(0);
                    for (int i = 1; i < part.length(); i++) {
                        masked += "*";
                    }
                    masked += " ";
                }
            }

            return masked.trim() + " | Balance: " + balance + " | Status: " + accountStatus;
        }

        // ===========================
        // 🔹 Static Method
        // ===========================
        public static PaymentAccount compareAccounts(PaymentAccount a, PaymentAccount b) {

            if (a.accountStatus.equals("Active") && b.accountStatus.equals("Active")) {
                return (a.balance > b.balance) ? a : b;
            } else if (a.accountStatus.equals("Active")) {
                return a;
            } else if (b.accountStatus.equals("Active")) {
                return b;
            }

            return null;
        }
    }

    public static void main(String[] args) {

        // Basic
        PaymentAccount acc1 = new PaymentAccount("umer amir");

        // Standard
        PaymentAccount acc2 = new PaymentAccount("ali khan", 5000);

        // CSV
        PaymentAccount acc3 = new PaymentAccount("john doe, 3000", true);

        // Payments
        acc2.processPayment(1000);
        acc2.processPayment(28000, "PKR");
        acc2.processPayment("PAY:200");

        // Summary
        System.out.println(acc2.getAccountSummary());

        // Compare
        PaymentAccount richer = PaymentAccount.compareAccounts(acc1, acc2);
        if (richer != null) {
            System.out.println("Higher balance account selected.");
        }
    }
}