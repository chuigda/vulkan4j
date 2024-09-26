public final class Main {
    public static void main(String[] args) {
        if (!loadLibraries()) {
            return;
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
