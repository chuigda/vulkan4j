
# 常见问题解答

> 本章内容的翻译使用了生成式人工智能，可能存在不准确之处。如有问题，欢迎提交问题和拉取请求。
>
> [英文版](https://vulkan4j.doki7.club/tutorial/en/faq.html) | [C++ 版本](https://vulkan-tutorial.com/FAQ)

本页面列出了你在开发 Vulkan 应用程序时可能会遇到的常见问题及其解决方案。

<!-- 
TODO: macOS
* **（macOS）我安装了 Vulkan SDK，但在运行 Vulkan 应用程序时，遇到 `libvulkan.dylib` 未找到的错误** ——请参阅 [macOS 版 Vulkan SDK 安装说明中的`设置环境`部分](./development-environment.md#setup-environment)
-->

* **我在核心校验层中遇到了访问冲突错误** —— 请确保 MSI Afterburner / RivaTuner Statistics Server 没有运行，因为它与 Vulkan 存在一些兼容性问题。

* **我没有看到来自校验层的任何消息 / 校验层不可用** —— 首先，请确保校验层有机会打印错误，方法是在程序退出后保持终端打开。在 Visual Studio 中，你可以通过按 Ctrl+F5（而不是 F5）来运行程序以实现此目的；在 Linux 上，可以通过从终端窗口执行程序来实现。如果仍然没有消息，并且你确定校验层已启用，那么你应该确保你的 Vulkan SDK 已正确安装，方法是按照[此页面上的](https://vulkan.lunarg.com/doc/view/1.4.313.0/windows/getting_started.html)“验证安装”说明进行操作。另外，请确保你的 SDK 版本至少为 1.1.106.0，以支持 `VK_LAYER_KHRONOS_validation` 校验层。

* **vkCreateSwapchainKHR 在 SteamOverlayVulkanLayer64.dll 中触发错误** —— 这似乎是 Steam 客户端测试版中的一个兼容性问题。有一些可能的解决方法：
  * 退出 Steam 测试版计划。
  * 将 `DISABLE_VK_LAYER_VALVE_steam_overlay_1` 环境变量设置为 `1`
  * 删除注册表中 `HKEY_LOCAL_MACHINE\SOFTWARE\Khronos\Vulkan\ImplicitLayers` 下的 Steam overlay Vulkan layer 条目。

例如：

![Steam 层](../images/steam_layers_env.png)
