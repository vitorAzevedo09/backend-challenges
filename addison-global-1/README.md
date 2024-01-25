# Addison Global Backend Technical Assessment

## Introduction

Welcome to the Addison Global Backend technical test. This exercise aims to evaluate your problem-solving approach, code quality, and ability to develop clean, well-tested, and reusable code. Despite some snippets being in Scala, the exercise can be completed in Java.

### Glossary

- **Credentials**: A tuple of username and password used for customer authentication.
- **User**: Identifies a customer within the system, containing a userId matching the username.
- **UserToken**: Token granted to a user for further operations, formed by concatenating the userId and current time.

### Implementation Example

```java
class Credentials {
    String username;
    String password;
}

class User {
    String userId;
}

class UserToken {
    String token;
}
```

## Exercise

### 1. Service Trait / Interface

Given synchronous and asynchronous definitions of the `TokenService`:

```java
interface SyncTokenService {
    UserToken requestToken(Credentials credentials);
}

interface AsyncTokenService {
    CompletableFuture<UserToken> requestToken(Credentials credentials);
}
```

**Task: Provide both implementations of `requestToken` in terms of `authenticate` and `issueToken`.**

### 2. Service Implementation

Provide an implementation for the following API:

```java
interface SimpleAsyncTokenService {
    CompletableFuture<UserToken> requestToken(Credentials credentials);
}
```

**Task: Implement an Actor/Service/Module that:**

- Validates Credentials and returns a User.
- Delays the User instance return with a random delay between 0 and 5000 milliseconds.
- Checks if the password matches the username in uppercase.
- Implements another Actor/Service/Module that returns a UserToken for a given User.
- Delays the UserToken instance return with a random delay between 0 and 5000 milliseconds.
- Fails if the userId of the provided User starts with A.
- Concatenates the userId and current date time in UTC for the UserToken.
- Implement the `requestToken` function/method from the `SimpleAsyncTokenService` interface by encapsulating its logic in an Actor/Service/Module.

### 3. REST API

**Task: Define a simple REST API to offer the functionality of the `SimpleAsyncTokenService`.**

**Evaluation Notes:**

We're interested in the structure and completeness of the API, as well as how it is tested.

## Deliverable

### Source Code

Bundle the code in one of the following ways:

- A zip file containing the whole project (skip binaries, logs, etc.).
- A link to an accessible private repository (GitHub or Bitbucket) with your work.

### Documentation / Instructions

Include a `Readme.md` file with:

- Assumptions and decisions made during the task.
- Technology and library choices.
- Instructions to run your solution and tests in a Linux environment.

**Note: Keep documentation concise, favoring self-documenting code.**
