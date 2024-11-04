//What is JWT, and what are its components?

/**
 * JWT, or JSON Web Token, is a small and secure way to send data over the internet. It has three simple parts:
 *
 * Header: Says what kind of token it is (JWT) and the method used to secure it.
 * Payload: Holds the main data, like user information or expiration time.
 * Signature: Makes sure no one changed the token; it's like a seal of approval.
 * In short, JWT is a safe package of information that can be verified quickly.
 */

//How does JWT work in authentication?

/**
 * Upon successful authentication, the server generates a JWT and sends it to the client. The client stores this token
 * (usually in local storage or cookies) and includes it in the headers of future requests. The server then verifies the token's signature to authenticate the user.
 */

//What are the advantages of using JWT over traditional session-based authentication?
/**
 * JWT is stateless, meaning the server doesn’t need to store session information, which can scale well for distributed systems.
 * It also allows client-side storage of the token and reduces the need for database calls on each request.
 */

//How can you create and verify a JWT in Java?
/**
 * Java libraries like jjwt (Java JWT) and Auth0 are commonly used to create and verify tokens.
 * You can use the io.jsonwebtoken package to generate and parse JWTs with code like:
 *
 * String jwt = Jwts.builder()
 *     .setSubject("user")
 *     .signWith(SignatureAlgorithm.HS256, "secretKey")
 *     .compact();
 */

//How do you handle token expiration and refresh in JWT?

/**
 * JWTs typically include an exp (expiration) claim.
 * Upon expiration, a refresh token can be issued to get a new JWT.
 * This is often handled with a separate refresh endpoint that requires user authentication.
 */

//Flow
/**
 * Generate Tokens (Server Side):
 * Upon successful login, the server verifies the user’s credentials and issues both an access token (short-lived) and a refresh token (longer-lived).
 *
 * Handle Token Expiry (Client Side):
 * The access token expires quickly, so the client must detect its expiration and use the refresh token
 * to get a new access token by calling the /auth/refresh endpoint.
 *
 * Calling /auth/refresh:
 * This call is not automatic. The client must either check the access token’s "exp" (expiration claim)
 * before each request or detect a 401 Unauthorized response and then request a new access token using the refresh token.
 *
 * Retry Logic:
 * Once a new access token is received, the client can retry the original request using the new token.
 *
 * {
 *   "accessToken": "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VySWQiOiIxMjM0NTY3ODkwIiwiaWF0IjoxNjA3MTIyMDQ3LCJleHAiOjE2MDcxMjU2NDd9.G9A5NJE6ZiL2cA-9pbG8m_7g3XAFZr5C9P-TySTp5pY",
 *   "refreshToken": "dGhpcyBpcyBqd3QgcmVmcmVzaCB0b2tlbiB0ZXN0IGNvbnRlbnQ",
 *   "tokenType": "Bearer",
 *   "expiresIn": 900 // access token validity in seconds (15 minutes)
 * }
 * This setup allows the user to stay authenticated with minimal disruption while keeping the access token secure and short-lived.
 */



