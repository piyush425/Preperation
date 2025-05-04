package SpringBoot;

/**
 * https://drive.google.com/drive/u/0/folders/1rBuonTOmVNc2Xsk0IhCmAT1SsNRqlJeh
 *
 */

/**
 * @ConditionalOnProperty
 * is used to enable or disable a bean based on a property value from application.properties or application.yml.
 *
 * application.property
 * email.service.enabled=true
 *
 * @Service
 * @ConditionalOnProperty(name = "email.service.enabled", havingValue = "true")
 * public class EmailService {
 *     public EmailService() {
 *         System.out.println("EmailService is enabled!");
 *     }
 *
 *     public void sendEmail() {
 *         System.out.println("Sending email...");
 *     }
 * }
 * If email.service.enabled=true, the EmailService bean is created.
 * If email.service.enabled=false (or absent), the bean is not loaded, and AppRunner prints "EmailService is disabled.".
 */

/**
 * The @Profile annotation in Spring Boot is used to activate beans based on the active profile (e.g., dev, test, prod).
 *
 * spring.profiles.active=dev
 *
 * @Service
 * @Profile("dev")  // This bean will be active only in 'dev' profile
 * class DevDatabaseService implements DatabaseService {
 *     @Override
 *     public void connect() {
 *         System.out.println("Connected to Dev Database");
 *     }
 * }
 * @Service
 * @Profile("prod")  // This bean will be active only in 'prod' profile
 * class ProdDatabaseService implements DatabaseService {
 *     @Override
 *     public void connect() {
 *         System.out.println("Connected to Prod Database");
 *     }
 * }
 *
 * Condition Type
 * conditionalOnProperty-Based on a specific property value (true/false, string match, etc.)
 * profile-Based on the active profile (e.g., dev, prod)
 * Use Case
 * conditionalOnPropertyFeature toggles, enabling/disabling specific components dynamically	E
 * profile-environment-specific beans, such as database configs, logging, etc.
 */

public class PROFILE {


}
