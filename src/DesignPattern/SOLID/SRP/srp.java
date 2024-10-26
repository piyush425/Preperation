package DesignPattern.SOLID.SRP;


/**
 * Single responsibility principle(SRP)
 *
 * A class should one reason to change
 *
 * Here, ReportGenerator handles report generation, and EmailSender handles email sending, adhering to SRP.
 */
public class srp {
    public static void main(String[] args) {
        reportManager reportManager =new reportManager();

        emailSender emailSender=new emailSender();

        reportManager.collectReport();
        emailSender.sendEmail();
    }
}
