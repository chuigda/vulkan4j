## Contribution Guidelines

Thanks for your participating `vulkan4j` development! To keep things efficient *and ♥Doki Doki♥*, please read the following guidelines before you start.

### Communication

- **Bug Reports & Feature Requests**: Please use [GitHub Issues](https://github.com/club-doki7/vulkan4j/issues).
- **Development Discussion & Questions**: Please use [GitHub Discussions](https://github.com/club-doki7/vulkan4j/discussions).
- **Quick Questions & General Chat**: Feel free to join our [Discord](https://discord.gg/UsmRvrt4gg) channel.
- *__Criticizing & Blaming Author__*: Use this [dedicated issue](https://github.com/club-doki7/vulkan4j/issues/1).

### Before Commencing Contribution

- If you are going to resolve a specific issue in the issue tracker, we strongly advise you to comment on the issue first, or self assign it, to avoid duplicate work.
  - If you no more have time to work on that issue, feel free to unassign yourself or comment on the issue to let others know.
- If you are going to add a new feature, or you found a bug that is not reported in the issue tracker, we advise you to create a new issue first, to help us avoid duplicate work and to help you get feedback from the maintainers, *also make the project looks more active and bustling*.

### Development Environment Setup

1. **Build Tool**: This project uses Maven.
2. **JDK Version**: This project requires **Java 22 or higher**.
3. **IDE Setup**:

    To ensure your IDE correctly recognizes the project structure, **DO NOT** open the repository root directory (`vulkan4j`). Instead, open the `vulkan4j/modules` directory as the project root (because our `pom.xml` is here).

    If your development machine has limited resources, you can also open only the specific submodule you intend to work on (e.g., `vulkan4j/modules/ffm-plus`).

4. **Git settings**: If you are using Windows, turn off the `core.autocrlf` settings in your Git configuration **before** cloning the repository. This is to ensure that line endings in your cloned repository are LF, so Git won't report 1145141919810 useless line-ending changes when you re-run the code generator.

### Contribution Workflow

We use the "Fork & Pull Request" model for collaboration:
1. Fork this repository to your own account.
2. Make your changes and commit them to your repository.
3. Create a Pull Request targeting the `master` branch of this repository.

### Branching and Commits

- **Branch Naming**: Please **AVOID using slashes (`/`)** in branch names, as they can cause very weird issues with `git checkout`. Use hyphens (`-`) or underscores (`_`) instead. Otherwise, feel free to name your branch whatever you like.
- **PR Titles**: We use **Squash Merge**, which means your PR title will become the final commit message. Please write a clear and descriptive title.

### Code Style

1. **Indentation**: Use **4 spaces** for indentation in all Java and Kotlin code.
2. **Line Length**: **100** characters is preferred, but **120** characters is acceptable if you have a good reason for that.
3. **Line Ending**: Use **LF** (`\n`) line endings for all text files.
4. **Ensure a newline at the end of files**
5. **Null-Safety Annotations**

    We use `org.jetbrains.annotations:26.0.2` for null-safety. The rules are:
    - **Non-Null by Default**: All reference types (parameters, return values, fields) are non-null by default. You are **RECOMMENDED** but not required to add the `@NotNull` annotation.
    - **Explicit Nullable**: You **MUST** use the `@Nullable` annotation to explicitly mark any reference that can actually be `null`.

> [`.editorconfig`](./.editorconfig)

### Testing Things Out

1. **The `ffm-plus` Module**

    This module has dedicated unit tests.

    To run certain test cases, you need to run the build scripts in the `misc/test_binary` directory to generate required native binaries. You can skip this if you're not working on related features -- that several local tests will fail, but the CI will catch them anyway.

2. **Modifying Existing API Bindings**

    Ensure that your changes do not break the corresponding examples in `modules/example`. Since many graphics APIs are unavailable on CI machines, this part heavily relies on manual testing. The more thoroughly you test, the less work it is for the maintainers.

3. **Adding New API Bindings**

   If you add a new API binding, please add a simple "dogfooding" test for it under `modules/example` to demonstrate that it works. If you don't provide a test, the binding will be marked as **experimental**.

### `codegen-v2` Module: Steps For Adding New API Bindings

When adding a binding for a new C/C++ API, follow these steps:

1. **Prepare Input Files**

    In the `codegen-v2/input` directory, create a download script to fetch the XML/YML registry files or header files, or other resources needed for the binding. The script must lock the file version using a tag, commit hash, or similar method.
    - **Tip**: You can use `clang-format` to preprocess header files, making them easier for the `hparse` and `cdecl` modules to handle.

2. **Implement a Metadata Extractor**

    Create a new metadata extractor module for the API under `club.doki7.babel.extract`.

    - When parsing header files, we recommend using the `hparse` and `cdecl` modules together. The `stb` and `vma` bindings serve as good examples.
    - To automatically handle "syntax trivia" level macros, you can add these macros to the `knownTriviaMacros` and `knownTriviaCallLikeMacros` sets in the `tokenize.kt` file.
    - **Code Reuse Policy**: If you see a feature you need that **seems to** exist in another extractor (e.g., struct parsing), **DO NOT** try to reuse code in the first place. Instead, most times you'll find that you actually want to **COPY AND PASTE** the code you found into your new module. This is a deliberate trade-off, and here is why:

      There are many de-facto C-dialects among the world, and the extraction requirements for different APIs have many subtle but important differences. If you reuse code by importing things, your code may break when the original module is updated, or you may break other modules when updating your module vice versa. Creating a "unified" parser trying to handle all APIs is a even more terrible idea, as it will lead to a lot of branches and complexity, making the code hard to maintain.

      Only if you find something to be **general enough** to be reused across multiple extractors (like `detectFunctionAlikeMacro`, `skipPreprocessor` or `parseStructFieldDecl`) should you consider extracting and promoting them into `hparse` or `cdecl` modules.
    - **Nullability Rules**:
      - **Pointer function parameters** are **nullable** by default unless explicitly marked as non-null (e.g., via a `VMA_NOT_NULL` macro).
      - **Structure fields** are **non-null** by default unless explicitly marked as nullable.
    - **Pointer to one vs pointer to many**: Mark pointer function parameter as `pointerToOne` if you are sure it points to a single object. Don't do this if you're not 100% sure about this.
    - The extractor is responsible for renaming parsed objects. Refer to existing modules for examples.

3. **Create a Code Generation Driver**
    In the `club.doki7.babel.drv` module, create a new Kotlin file with a `main` function to drive code generation. Again, refer to existing modules for examples.

4. **Validate Changes to Shared Components**
    If you modify any shared components (like `hparse` or `cdecl`), you **MUST** rerun the code generation for all other API bindings to ensure your changes have not introduced any regressions.

### Pre-submission Checklist

Before submitting your Pull Request, please ensure you have:
- Updated `README.md` if your changes affect the project's usage or architecture.
- Added a clear entry for your changes in `CHANGELOG.md`.

*♥Doki Doki♥!*
