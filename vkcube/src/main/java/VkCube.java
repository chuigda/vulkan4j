public final class VkCube {
    public static void main(String[] args) {
        if (!loadLibraries()) {
            System.exit(-1);
        }

        try (var D30F6 = new Engine()) {
            D30F6.run();
        } catch (Exception e) {
            UICommons.showErrorMessage("运行时发生错误: " + e.getMessage());
            System.exit(-1);
        }

        System.exit(0);
    }

    private static boolean loadLibraries() {
        try {
            if (System.getProperty("os.name").toLowerCase().contains("windows")) {
                System.loadLibrary("glfw3");
            }
            else {
                System.loadLibrary("glfw");
            }
        }
        catch (Throwable throwable) {
            UICommons.showErrorMessage("加载 GLFW 库失败: " + throwable.getMessage());
            return false;
        }

        try {
            if (System.getProperty("os.name").toLowerCase().contains("windows")) {
                System.loadLibrary("vulkan-1");
            }
            else {
                System.loadLibrary("vulkan");
            }
        }
        catch (Throwable throwable) {
            UICommons.showErrorMessage("加载 Vulkan 库失败: " + throwable.getMessage());
            return false;
        }

        return true;
    }
}
