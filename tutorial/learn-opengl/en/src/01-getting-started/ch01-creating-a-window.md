# Creating a window

The first thing we need to do before we start creating stunning graphics is to create an OpenGL context and an application window to draw in. However, those operations are specific per operating system and OpenGL purposefully tries to abstract itself from these operations. This means we have to create a window, define a context, and handle user input all by ourselves. 

Luckily, there are quite a few libraries out there that provide the functionality we seek, some specifically aimed at OpenGL. Those libraries save us all the operation-system specific work and give us a window and an OpenGL context to render in. Some of the more popular libraries are GLUT, SDL, SFML and GLFW. On LearnOpenGL we will be using **GLFW**.

Feel free to try any of the other libraries, the setup for most is similar to GLFW's setup. But not all libraries have a `vulkan4j` ecosystem binding. `vulkan4j` ecosystem is somewhat designed to work with prior FFI practices (JNI + `java.nio`), so if you really wants a different library, you just need a little bit of work to make it work with `vulkan4j`.

## Maven project

Create a Maven project and add the following dependencies to your `pom.xml` file:

```xml
<dependency>
    <groupId>club.doki7</groupId>
    <artifactId>ffm-plus</artifactId>
    <version>0.2.0</version>
</dependency>
<dependency>
    <groupId>club.doki7</groupId>
    <artifactId>opengl</artifactId>
    <version>0.3.1</version>
</dependency>
<dependency>
    <groupId>club.doki7</groupId>
    <artifactId>glfw</artifactId>
    <version>0.3.1</version>
</dependency>
<dependency>
    <groupId>org.joml</groupId>
    <artifactId>joml</artifactId>
    <version>1.10.8</version>
</dependency>
<dependency>
    <groupId>de.javagl</groupId>
    <artifactId>obj</artifactId>
    <version>0.4.0</version>
</dependency>
```

`club.doki7.opengl` is the OpenGL binding for Java, `club.doki7.ffm-plus` is a library that provides a thin wrapper over the Java 22 FFM APIs to make them easier and more type-safe to use. `club.doki7.glfw` is a Java binding for the GLFW library, which we'll use for window creation. `org.joml` is a math library that we'll use for vector and matrix operations. `de.javagl.obj` is a library for loading Wavefront OBJ files, which we'll use for loading 3D models.

## GLFW setup


