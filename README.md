# OOP course repository

Your own copy of the repository for the Object-Oriented Programming course. You write your examples sheet
code and tests here, and GitHub runs them for you every time you push.

## Lecture 0 setup task

Do this before the first lecture. It is question 1 of the examples sheet.

1. **Install a JDK, version 25.** Any distribution works. [Eclipse Temurin](https://adoptium.net/) is a good
   default; on macOS `brew install --cask temurin@25` also works. Check with `java -version` in a terminal.
2. **Install an editor.** Either works; use whichever you prefer.
   - **VS Code:** install [VS Code](https://code.visualstudio.com/), then open this repository's folder.
     It offers to install the *Extension Pack for Java*; accept. If it can't find your JDK, run
     *Java: Configure Java Runtime* from the command palette (Ctrl/Cmd+Shift+P).
   - **IntelliJ IDEA:** [IntelliJ IDEA](https://www.jetbrains.com/idea/) is free for students and can download
     a JDK for you: *File > Project Structure > SDK > Download JDK*.
3. **Clone your copy of this repository.** Use the link from the course page to get your own copy, then
   `git clone <your copy's URL>`. Or in VS Code use *Git: Clone* from the command palette, and in IntelliJ
   *File > New > Project from Version Control*.
4. **Run the tests** from the repository folder:
   ```
   ./mvnw test          # macOS, Linux
   mvnw.cmd test        # Windows
   ```
   The first run downloads Maven and the libraries, so it takes a minute. You should see
   `Tests run: 4, Failures: 0, Errors: 0, Skipped: 3` and `BUILD SUCCESS`.
5. **Commit and push a small change.** For example, change the name in `src/main/java/hello/Hello.java`
   and the expected string in `src/test/java/hello/HelloTest.java` to match, then:
   ```
   git commit -am "Say hello to me"
   git push
   ```
6. **Check that CI goes green.** Open your repository on GitHub and click the *Actions* tab. Your push
   starts a run called *CI*; a green tick means everything compiled and every test passed.
7. **Try `jshell`.** Type `jshell` in a terminal and print hello world in one line of code.
   `/exit` leaves it.

If `./mvnw` says it cannot find Java, set `JAVA_HOME` to your JDK's folder, or run the tests from your
editor instead: the flask icon (*Testing*) in VS Code's sidebar, or right-click `src/test/java` > *Run 'All Tests'*
in IntelliJ.

## Where things go

```
src/main/java/   your code, one package per examples sheet section (s01, s02, ...)
src/test/java/   your JUnit tests, in the same package as the code they test
pom.xml          the build: Java 25, JUnit, Mockito and the coverage report
```

Some questions give you code to run, test or fix. To save you typing it in, it is already here:

| Section | Code | |
|---|---|---|
| 1 | `s01/pythonport/Factorial` | empty method for the Python port |
| 2 | `s02/srp/Report` | |
| 3 | `s03/aliasing/Team` and its test | the test is switched off with `@Disabled` until you get to it |
| 4 | `s04/countingset/CountingSet` | |
| 5 | `s05/notifier/OverdueNotifier` | |
| 6 | `s06/testlifecycle/CounterTest` (in `src/test`) | switched off with `@Disabled` |
| 7 | `s07/iteration/RemoveEvens`, `s07/methodrefs/StringUtils`, `s07/books/Books` | |
| 8 | `s08/rawtypes/Inventory` | |
| 9 | `s09/optional/Directory`, `s09/swallow/Config`, `s09/tdd/Durations` | `Durations` is empty: write its tests first |
| 10 | `s10/apples/Apples` | |

For every other question, add a new package or class wherever it makes sense.

## Tests, CI and coverage

- `./mvnw test` compiles everything and runs every test. Both editors run a single test from the arrow
  next to each `@Test`.
- A failing test fails the build, both on your machine and on GitHub. That is what you want when you
  write tests first (Section 9).
- Each run also measures which lines your tests executed. Locally, open `target/site/jacoco/index.html`
  after `./mvnw test`. On GitHub, the run's summary page shows a table of line coverage per class, and the
  full report is attached to the run as *coverage*.
- The compiler warns about unchecked generic operations (Section 8). To make those warnings fail the build,
  add `<arg>-Werror</arg>` next to `<arg>-Xlint:unchecked</arg>` in `pom.xml`.
