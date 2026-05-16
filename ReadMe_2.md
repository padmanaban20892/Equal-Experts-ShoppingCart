# Shopping Cart

## Overview

This project implements a simple shopping cart system with the following capabilities:

* Add products with quantity
* Fetch product prices from an external Price API
* Maintain cart state
* Calculate subtotal, tax, and total

The focus of this implementation is simplicity, testability, and adherence to the given requirements.

---

## Features

* Add products by name and quantity
* Aggregate same products
* Fetch pricing from external API:
  `https://equalexperts.github.io/backend-take-home-test-data/`
* Calculate:

    * Subtotal
    * Tax (12.5%)
    * Total
* Proper rounding to 2 decimal places

---

## Project Structure

```text
src/
├── main/java/com/equalexperts/
│   ├── client/     → Price API integration
│   ├── model/      → Product & CartItem
│   ├── service/    → ShoppingCart business logic
│   └── util/       → Rounding utility
│
└── test/java/com/equalexperts/
    ├── service/    → ShoppingCart tests
    ├── client/     → PriceApi tests
    └── util/       → RoundingUtil tests
```

---

## How to Run

### Prerequisites

* Java 21
* Gradle

---

### Run Unit Tests

```bash
./gradlew clean test
```

Windows:

```bash
gradlew.bat clean test
```

---

## Run with Code Coverage (JaCoCo)

```bash
./gradlew clean test jacocoTestReport
```

### View Coverage Report

```text
build/reports/jacoco/test/html/index.html
```

---

## Design Decisions

* Simple layered structure (model, service, client)
* Separation of concerns for testability
* API interaction isolated in client layer
* Rounding handled via utility class

---

## Possible Improvements

* Add caching for API responses
* Add retry logic for API failures
* Make cart thread-safe
* Add validation for invalid products
* Expose functionality via REST API

---

## AI Tool Usage

### Specific Use Cases

AI tools were used for:

* Code structure suggestions
* Debugging assistance
* README formatting improvements
* Unit test guidance

### Percentage of AI-Generated Code

Approximately 30–40% of the code was generated with AI assistance and then reviewed and modified manually.

### Review Process

All AI-generated code was manually reviewed, tested, and validated using unit tests to ensure correctness and quality.

---

## Notes

This solution prioritizes simplicity, readability, and maintainability while satisfying all assignment requirements.
