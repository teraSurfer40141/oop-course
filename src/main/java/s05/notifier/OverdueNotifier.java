package s05.notifier;

import java.time.LocalDate;

/** Section 5: the class from the test doubles question. */
public class OverdueNotifier {
    public record Loan(String title, String borrower, LocalDate due) {}

    // Emails the borrower if the loan is overdue on the given day
    public void check(Loan loan, LocalDate today) {
        if (today.isAfter(loan.due())) {
            SmtpMailer mailer = new SmtpMailer("smtp.example.ac.uk");
            mailer.send(loan.borrower(), "Overdue: " + loan.title());
        }
    }
}

// Stands in for a class that really connects to a mail server
class SmtpMailer {
    private final String host;
    SmtpMailer(String host) { this.host = host; }
    void send(String to, String subject) {
        throw new IllegalStateException("no mail server at " + host);
    }
}
