package Interview;


/**
 * 1. Handling a Production Issue, Escalation, and Fix
 *
 * Issue:
 * We were calling a third-party MultiBureau API that had three sequential API calls. The issue was that when we immediately called the second API after the first, it failed intermittently.
 *
 * Investigation & Root Cause:
 * Checked logs and found that the second API was failing due to rate limiting (429 error).
 * The third-party system required a small delay before calling the next API.
 * Fix Implemented:
 * Added Retry Logic:
 *
 * Implemented a retry mechanism with a short delay before retrying the failed request.
 * Used exponential backoff (e.g., wait 1s, then 2s, then 4s) to avoid hitting the rate limit.
 * Ensured Stability:
 *
 * Introduced a small delay between API calls to prevent failures.
 * This allowed smooth communication with the third-party service.
 * Escalation & Communication:
 * Reported the issue to the L3 team and coordinated with the vendor.
 * Monitored logs to verify that failures reduced significantly after the fix.
 * Result:
 * API failures reduced by 90%, ensuring smooth processing.
 * The retry logic prevented downtime and made the system more stable.
 *
 * 1. Checking Logs
 * To diagnose the issue, I checked logs in Kibana (log monitoring tool) and the application logs stored in our system.
 *
 * Kibana:
 *
 * Searched for failed API calls using filters like HTTP status code (429, 500).
 * Checked timestamps to see when failures were happening.
 */

public class ScnerioBased {
}
