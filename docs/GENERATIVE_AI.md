## Generative AI Policy

In order to keep the quality of the codebase *and @chuigda's sanity*:

- Remember: LLMs are **not** perfect, on the contrary they will make mistakes even more often than humans. **The more complicated the task is, the more hallucination LLMs will make**.
- Copilot alike real-time code assistants are OK to use, because you can inspect and intervene what LLMs do, *unless you're just keep pressing the "Tab" key to accept suggestions until there's no red wavy lines[^1].*
- Passage level code generation assistant is only applicable to short, testable code.
- File level code generation assistants should be limited to testcases, documentation and other non-critical code. After generation, you must **double-check** to make sure that **LLM DID EXACTLY WHAT YOU WANT**. *Double check: a powerful chess tactic.*
- Advanced "agents" like Cursor, Windsurf and Codeium, *which are very fashionable recently*, are strictly prohibited currently. We've seen many times that these tools show **very severe hallucination**, especially in complicated tasks.
- Pay extra attention when you are using LLM to write code for the `codegen-v2` module: most of the generated code are not very testable (see CONTRIBUTING.md). Also changes to `codegen-v2` module are not very intuitive to review. Once a bug is introduced, it will be sneaky and hard to figure it out.

[^1]: [*Are you just making changes by randomly inserting and deleting characters until you don't see warnings?*](https://lkml.indiana.edu/hypermail/linux/kernel/0810.2/1735.html)
