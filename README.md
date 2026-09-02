# LeetCode DSA Solutions

Java solutions for LeetCode and data-structure-and-algorithm problems, organized by difficulty.

## Project Structure

```text
src/
└── main/
	└── java/
		└── leetcode/
		|	├── easy/
		|	├── medium/
		|	└── hard/
		└── leetcode75/
```

Each solution is kept in its own Java class and uses a package that matches its difficulty directory. Problem titles are reflected in the class names, with the LeetCode problem number included where applicable.

## Requirements

- Java Development Kit (JDK) 21 or later
- Apache Maven 3.9 or later

Check your installed versions with:

```bash
java -version
mvn -version
```

## Build and Test

Clone the repository and move into its directory:

```bash
git clone <repository-url>
cd leetcode-dsa
```

Compile the project and run the Maven test lifecycle with:

```bash
mvn clean test
```

The compiled classes are generated in `target/classes`.

## Running a Solution

Most solution classes expose a method intended to be called by a test or a small runner, following the method signature required by LeetCode. To experiment locally, add a focused test or invoke the class from a temporary runner using its fully qualified package name.

For example, a class in the easy category is addressed as:

```java
leetcode.easy.RobotReturnToOrigin_657
```

## Adding a New Solution

1. Choose the appropriate difficulty directory under `src/main/java/leetcode`.
2. Create a class named after the problem and include its LeetCode number when available.
3. Declare the matching package, such as `package leetcode.medium;`.
4. Keep the implementation focused on the problem and add tests when the behavior benefits from local verification.
5. Run `mvn clean test` before committing the change.

## License

This project is available under the terms of the [LICENSE](LICENSE) file.
