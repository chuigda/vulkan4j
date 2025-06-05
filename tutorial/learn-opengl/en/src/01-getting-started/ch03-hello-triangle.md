# Hello Triangle

> [C++ version](https://learnopengl.com/Getting-started/Hello-Triangle)

In OpenGL everything is in 3D space, but the screen or window is a 2D array of pixels so a large part of OpenGL's work is about transforming all 3D coordinates to 2D pixels that fit on your screen. The process of transforming 3D coordinates to 2D pixels is managed by the **graphics pipeline** of OpenGL. The graphics pipeline can be divided into two large parts: the first transforms your 3D coordinates into 2D coordinates and the second part transforms the 2D coordinates into actual colored pixels. In this chapter we'll briefly discuss the graphics pipeline and how we can use it to our advantage to create fancy pixels.

The graphics pipeline takes as input a set of 3D coordinates and transforms these to colored 2D pixels on your screen. The graphics pipeline can be divided into several steps where each step requires the output of the previous step as its input. All of these steps are highly specialized (they have one specific function) and can easily be executed in parallel. Because of their parallel nature, graphics cards of today have thousands of small processing cores to quickly process your data within the graphics pipeline. The processing cores run small programs on the GPU for each step of the pipeline. These small programs are called **shaders**.

Some of these shaders are configurable by the developer which allows us to write our own shaders to replace the existing default shaders. This gives us much more fine-grained control over specific parts of the pipeline and because they run on the GPU, they can also save us valuable CPU time. Shaders are written in the **OpenGL Shading Language** (**GLSL**) and we'll delve more into that in the next chapter.

Below you'll find an abstract representation of all the stages of the graphics pipeline. Note that the blue sections represent sections where we can inject our own shaders.

![Pipeline](../../images/pipeline.png)

As you can see, the graphics pipeline contains a large number of sections that each handle one specific part of converting your vertex data to a fully rendered pixel. We will briefly explain each part of the pipeline in a simplified way to give you a good overview of how the pipeline operates.

As input to the graphics pipeline we pass in a list of three 3D coordinates that should form a triangle in an array here called `Vertex Data`; this vertex data is a collection of vertices. A **vertex** is a collection of data per 3D coordinate. This vertex's data is represented using **vertex attributes** that can contain any data we'd like, but for simplicity's sake let's assume that each vertex consists of just a 3D position and some color value.

> In order for OpenGL to know what to make of your collection of coordinates and color values OpenGL requires you to hint what kind of render types you want to form with the data. Do we want the data rendered as a collection of points, a collection of triangles or perhaps just one long line? Those hints are called **primitives** and are given to OpenGL while calling any of the drawing commands. Some of these hints are `GL_POINTS`, `GL_TRIANGLES` and `GL_LINE_STRIP`.

The first part of the pipeline is the **vertex shader** that takes as input a single vertex. The main purpose of the vertex shader is to transform 3D coordinates into different 3D coordinates (more on that later) and the vertex shader allows us to do some basic processing on the vertex attributes. 

The output of the vertex shader stage is optionally passed to the **geometry shader**. The geometry shader takes as input a collection of vertices that form a primitive and has the ability to generate other shapes by emitting new vertices to form new (or other) primitive(s). In this example case, it generates a second triangle out of the given shape.

The **primitive assembly** stage takes as input all the vertices (or vertex if `GL_POINTS` is chosen) from the vertex (or geometry) shader that form one or more primitives and assembles all the point(s) in the primitive shape given; in this case two triangles.

The output of the primitive assembly stage is then passed on to the **rasterization stage** where it maps the resulting primitive(s) to the corresponding pixels on the final screen, resulting in fragments for the fragment shader to use. Before the fragment shaders run, **clipping** is performed. Clipping discards all fragments that are outside your view, increasing performance.

> A fragment in OpenGL is all the data required for OpenGL to render a single pixel.

The main purpose of the **fragment shader** is to calculate the final color of a pixel and this is usually the stage where all the advanced OpenGL effects occur. Usually the fragment shader contains data about the 3D scene that it can use to calculate the final pixel color (like lights, shadows, color of the light and so on).

After all the corresponding color values have been determined, the final object will then pass through one more stage that we call the **alpha test** and **blending** stage. This stage checks the corresponding depth (and stencil) value (we'll get to those later) of the fragment and uses those to check if the resulting fragment is in front or behind other objects and should be discarded accordingly. The stage also checks for alpha values (alpha values define the opacity of an object) and **blends** the objects accordingly. So even if a pixel output color is calculated in the fragment shader, the final pixel color could still be something entirely different when rendering multiple triangles.

As you can see, the graphics pipeline is quite a complex whole and contains many configurable parts. However, for almost all the cases we only have to work with the vertex and fragment shader. The geometry shader is optional and usually left to its default shader. There is also the tessellation stage and transform feedback loop that we haven't depicted here, but that's something for later. 

In modern OpenGL we are **required** to define at least a vertex and fragment shader of our own (there are no default vertex/fragment shaders on the GPU). For this reason it is often quite difficult to start learning modern OpenGL since a great deal of knowledge is required before being able to render your first triangle. Once you do get to finally render your triangle at the end of this chapter you will end up knowing a lot more about graphics programming. 

## Vertex input

To start drawing something we have to first give OpenGL some input vertex data. OpenGL is a 3D graphics library so all coordinates that we specify in OpenGL are in 3D (`x`, `y` and `z` coordinate). OpenGL doesn't simply transform all your 3D coordinates to 2D pixels on your screen; OpenGL only processes 3D coordinates when they're in a specific range between `-1.0` and `1.0` on all 3 axes (`x`, `y` and `z`). All coordinates within this so called **normalized device coordinates** range will end up visible on your screen (and all coordinates outside this region won't). 

Because we want to render a single triangle we want to specify a total of three vertices with each vertex having a 3D position. We define them in normalized device coordinates (the visible region of OpenGL) in a float array:

```java
private static final float[] VERTICES = {
    -0.5f, -0.5f, 0.0f,
    0.5f, -0.5f, 0.0f,
    0.0f,  0.5f, 0.0f
};
```

Because OpenGL works in 3D space we render a 2D triangle with each vertex having a `z` coordinate of `0.0`. This way the *depth* of the triangle remains the same making it look like it's 2D. 

> **Normalized Device Coordinates (NDC)**
> 
> Once your vertex coordinates have been processed in the vertex shader, they should be in **normalized device coordinates** which is a small space where the `x`, `y` and `z` values vary from `-1.0` to `1.0`. Any coordinates that fall outside this range will be discarded/clipped and won't be visible on your screen. Below you can see the triangle we specified within normalized device coordinates (ignoring the z axis): 
> 
> ![NDC](../../images/ndc.png)
> 
> Unlike usual screen coordinates the positive y-axis points in the up-direction and the `(0, 0)` coordinates are at the center of the graph, instead of top-left. Eventually you want all the (transformed) coordinates to end up in this coordinate space, otherwise they won't be visible.
> 
> Your NDC coordinates will then be transformed to **screen-space coordinates** via the **viewport transform** using the data you provided with `GL::viewport`. The resulting screen-space coordinates are then transformed to fragments as inputs to your fragment shader. 

With the vertex data defined we'd like to send it as input to the first process of the graphics pipeline: the vertex shader. This is done by creating memory on the GPU where we store the vertex data, configure how OpenGL should interpret the memory and specify how to send the data to the graphics card. The vertex shader then processes as many vertices as we tell it to from its memory.

We manage this memory via so-called **vertex buffer objects** (**VBO**) that can store a large number of vertices in the GPU's memory. The advantage of using those buffer objects is that we can send large batches of data all at once to the graphics card, and keep it there if there's enough memory left, without having to send data one vertex at a time. Sending data to the graphics card from the CPU is relatively slow, so wherever we can we try to send as much data as possible at once. Once the data is in the graphics card's memory the vertex shader has almost instant access to the vertices making it extremely fast 

A vertex buffer object is our first occurrence of an OpenGL object as we've discussed in the [OpenGL chapter](./ch00-opengl.md). Just like any object in OpenGL, this buffer has a unique ID corresponding to that buffer, so we can generate one with a buffer ID using the `GL::genBuffers` function:

```java
@Unsigned int vbo;
try(Arena arena = Arena.ofConfined()) {
    IntPtr pVBO = IntPtr.allocate(arena);
    gl.genBuffers(1, pVBO);
    vbo = pVBO.read();
}
```

> Note: Java does not really have unsigned integers. In Java's design, signedness is associated with operations (`Integer.toString` vs `Integer.toUnsignedString`) rather than types. The `@Unsigned` annotation is used to indicate that the value should be treated as an unsigned integer, so you could remember to use unsigned series methods when dealing with them as soon as you see the annotation.

OpenGL has many types of buffer objects, and the buffer type of the vertex buffer object is `GL.ARRAY_BUFFER`. OpenGL allows us to bind to several buffers at once as long as they have a different buffer type. We can bind the newly created buffer to the `GL.ARRAY_BUFFER` target with the `GL::bindBuffer` function: 

```java
gl.bindBuffer(GL.ARRAY_BUFFER, vbo);
```

From that point on any buffer calls we make (on the `GL.ARRAY_BUFFER` target) will be used to configure the currently bound buffer, which is `VBO`. Then we can make a call to the `GL::bufferData` function that copies the previously defined vertex data into the buffer's memory: 

```java
gl.bufferData(
        GL.ARRAY_BUFFER,
        pVertices.segment().byteSize(),
        pVertices.segment(),
        GL.STATIC_DRAW
);
```

`GL::bufferData` is a function specifically targeted to copy user-defined data into the currently bound buffer. Its first argument is the type of the buffer we want to copy data into: the vertex buffer object currently bound to the `GL.ARRAY_BUFFER` target. The second argument specifies the size of the data (in bytes) we want to pass to the buffer; a simple sizeof of the vertex data suffices. The third parameter is the actual data we want to send.

The fourth parameter specifies how we want the graphics card to manage the given data. This can take 3 forms:

- `GL.STREAM_DRAW`: the data is set only once and used by the GPU at most a few times.
- `GL.STATIC_DRAW`: the data is set only once and used many times.
- `GL.DYNAMIC_DRAW`: the data is changed a lot and used many times.

The position data of the triangle does not change, is used a lot, and stays the same for every render call so its usage type should best be `GL.STATIC_DRAW`. If, for instance, one would have a buffer with data that is likely to change frequently, a usage type of `GL.DYNAMIC_DRAW` ensures the graphics card will place the data in memory that allows for faster writes.

As of now we stored the vertex data within memory on the graphics card as managed by a vertex buffer object named `VBO`. Next we want to create a vertex and fragment shader that actually processes this data, so let's start building those.

## Vertex shader

The vertex shader is one of the shaders that are programmable by people like us. Modern OpenGL requires that we at least set up a vertex and fragment shader if we want to do some rendering so we will briefly introduce shaders and configure two very simple shaders for drawing our first triangle. In the next chapter we'll discuss shaders in more detail.

The first thing we need to do is write the vertex shader in the shader language GLSL (OpenGL Shading Language) and then compile this shader so we can use it in our application. Below you'll find the source code of a very basic vertex shader in GLSL:

```glsl
#version 330 core
layout (location = 0) in vec3 aPos;

void main() {
    gl_Position = vec4(aPos, 1.0f);
}
```

As you can see, GLSL looks similar to C. Each shader begins with a declaration of its version. Since OpenGL 3.3 and higher the version numbers of GLSL match the version of OpenGL (GLSL version 420 corresponds to OpenGL version 4.2 for example). We also explicitly mention we're using core profile functionality.

Next we declare all the input vertex attributes in the vertex shader with the in keyword. Right now we only care about position data so we only need a single vertex attribute. GLSL has a vector datatype that contains `1` to `4` floats based on its postfix digit. Since each vertex has a 3D coordinate we create a `vec3` input variable with the name `aPos`. We also specifically set the location of the input variable via `layout (location = 0)` and you'll later see that why we're going to need that location.

> **Vector**
> 
> In graphics programming we use the mathematical concept of a vector quite often, since it neatly represents positions/directions in any space and has useful mathematical properties. A vector in GLSL has a maximum size of 4 and each of its values can be retrieved via `vec.x`, `vec.y`, `vec.z` and `vec.w` respectively where each of them represents a coordinate in space. Note that the `vec.w` component is not used as a position in space (we're dealing with 3D, not 4D) but is used for something called perspective division. We'll discuss vectors in much greater depth in a later chapter. 

To set the output of the vertex shader we have to assign the position data to the predefined `gl_Position` variable which is a `vec4` behind the scenes. At the end of the main function, whatever we set `gl_Position` to will be used as the output of the vertex shader. Since our input is a vector of size `3` we have to cast this to a vector of size `4`. We can do this by inserting the `vec3` values inside the constructor of `vec4` and set its `w` component to `1.0f` (we will explain why in a later chapter). 

The current vertex shader is probably the most simple vertex shader we can imagine because we did no processing whatsoever on the input data and simply forwarded it to the shader's output. In real applications the input data is usually not already in normalized device coordinates so we first have to transform the input data to coordinates that fall within OpenGL's visible region. 

## Compiling a shader

We take the source code for the vertex shader and store it in a const Java string as a `static final` member of `Application` class:

```java
private static final String VERTEX_SHADER_SOURCE =
        """
        #version 330 core
        layout (location = 0) in vec3 aPos;
    
        void main() {
            gl_Position = vec4(aPos, 1.0);
        }
        """;
```

In order for OpenGL to use the shader it has to dynamically compile it at run-time from its source code. The first thing we need to do is create a shader object, again referenced by an ID. So we store the vertex shader as an `@Unsigned int` and create the shader with `GL::createShader`: 

```java
@Unsigned int vertexShader;
vertexShader = gl.createShader(GL.VERTEX_SHADER);
```

We provide the type of shader we want to create as an argument to `GL::createShader`. Since we're creating a vertex shader we pass in `GL.VERTEX_SHADER`.

Next we attach the shader source code to the shader object and compile the shader:

```java
vertexShader = gl.createShader(GL.VERTEX_SHADER);
var pVertexShaderSource = PointerPtr.allocateV(arena, BytePtr.allocateString(arena, VERTEX_SHADER_SOURCE));
gl.shaderSource(vertexShader, 1, pVertexShaderSource, null);
gl.compileShader(vertexShader);
```

The `GL::shaderSource` function takes the shader object to compile to as its first argument. The second argument specifies how many strings we're passing as source code, which is only one. The third parameter is the actual source code of the vertex shader and we can leave the 4th parameter to `null`. 

> You probably want to check if compilation was successful after the call to `GL::compileShader` and if not, what errors were found so you can fix those. Checking for compile-time errors is accomplished as follows:
> 
> ```java
> IntPtr pSuccess = IntPtr.allocate(arena);
> BytePtr infoLog = BytePtr.allocate(arena, 512);
> gl.getShaderiv(vertexShader, GL.COMPILE_STATUS, pSuccess);
> ```
> 
> First we define an integer to indicate success and a storage container for the error messages (if any). Then we check if compilation was successful with `GL::getShaderiv`. If compilation failed, we should retrieve the error message with `GL::getShaderInfoLog` and print the error message.
> 
> ```java
> if (pSuccess.read() == GL.FALSE) {
>     gl.getShaderInfoLog(vertexShader, infoLog);
>     throw new RuntimeException("Vertex shader compilation failed: " + infoLog.readString());
> }
> ```

If no errors were detected while compiling the vertex shader it is now compiled.

## Fragment shader

The fragment shader is the second and final shader we're going to create for rendering a triangle. The fragment shader is all about calculating the color output of your pixels. To keep things simple the fragment shader will always output an orange-ish color.

> Colors in computer graphics are represented as an array of 4 values: the red, green, blue and alpha (opacity) component, commonly abbreviated to RGBA. When defining a color in OpenGL or GLSL we set the strength of each component to a value between `0.0` and `1.0`. If, for example, we would set red to `1.0` and green to `1.0` we would get a mixture of both colors and get the color yellow. Given those 3 color components we can generate over 16 million different colors! 

```glsl
#version 330 core
out vec4 FragColor;

void main() {
    FragColor = vec4(1.0f, 0.5f, 0.2f, 1.0f);
}
```

The fragment shader only requires one output variable and that is a vector of size 4 that defines the final color output that we should calculate ourselves. We can declare output values with the out keyword, that we here promptly named `FragColor`. Next we simply assign a `vec4` to the color output as an orange color with an alpha value of `1.0` (`1.0` being completely opaque). 

The process for compiling a fragment shader is similar to the vertex shader, although this time we use the `GL.FRAGMENT_SHADER` constant as the shader type:

```java
@Unsigned int fragmentShader;
fragmentShader = gl.createShader(GL.FRAGMENT_SHADER);
var pFragmentShaderSource = PointerPtr.allocateV(arena, BytePtr.allocateString(arena, FRAGMENT_SHADER_SOURCE));
gl.shaderSource(fragmentShader, 1, pFragmentShaderSource, null);
gl.compileShader(fragmentShader);
```

Both the shaders are now compiled and the only thing left to do is link both shader objects into a **shader program** that we can use for rendering. Make sure to check for compile errors here as well!

## Shader program

A shader program object is the final linked version of multiple shaders combined. To use the recently compiled shaders we have to **link** them to a shader program object and then activate this shader program when rendering objects. The activated shader program's shaders will be used when we issue render calls.

When linking the shaders into a program it links the outputs of each shader to the inputs of the next shader. This is also where you'll get linking errors if your outputs and inputs do not match.

Creating a program object is easy:

```java
@Unsigned int shaderProgram;
shaderProgram = gl.createProgram();
```

The `GL::createProgram` function creates a program and returns the ID reference to the newly created program object. Now we need to attach the previously compiled shaders to the program object and then link them with `GL::linkProgram`: 

```java
gl.attachShader(shaderProgram, vertexShader);
gl.attachShader(shaderProgram, fragmentShader);
gl.linkProgram(shaderProgram);
```

The code should be pretty self-explanatory, we attach the shaders to the program and link them via `GL::linkProgram`.

> Just like shader compilation we can also check if linking a shader program failed and retrieve the corresponding log. However, instead of using `GL::getShaderiv` and `GL::getShaderInfoLog` we now use:
> 
> ```java
> gl.getProgramiv(shaderProgram, GL.LINK_STATUS, pSuccess);
> if (pSuccess.read() == GL.FALSE) {
>     gl.getProgramInfoLog(shaderProgram, infoLog);
>     throw new RuntimeException("Shader program linking failed: " + infoLog.readString());
> }
> ```

The result is a program object that we can activate by calling `GL::useProgram` with the newly created program object as its argument:

```java
gl.useProgram(shaderProgram);
```

Every shader and rendering call after `GL::useProgram` will now use this program object (and thus the shaders).

Oh yeah, and don't forget to delete the shader objects once we've linked them into the program object; we no longer need them anymore:

```java
gl.deleteShader(vertexShader);
gl.deleteShader(fragmentShader);
```

Right now we sent the input vertex data to the GPU and instructed the GPU how it should process the vertex data within a vertex and fragment shader. We're almost there, but not quite yet. OpenGL does not yet know how it should interpret the vertex data in memory and how it should connect the vertex data to the vertex shader's attributes. We'll be nice and tell OpenGL how to do that.

## Linking Vertex Attributes

The vertex shader allows us to specify any input we want in the form of vertex attributes and while this allows for great flexibility, it does mean we have to manually specify what part of our input data goes to which vertex attribute in the vertex shader. This means we have to specify how OpenGL should interpret the vertex data before rendering.

Our vertex buffer data is formatted as follows:

![Vertex attribute pointer](../../images/vertex_attribute_pointer.png)

- The position data is stored as 32-bit (4 byte) floating point values.
- Each position is composed of 3 of those values.
- There is no space (or other values) between each set of 3 values. The values are **tightly packed** in the array.
- The first value in the data is at the beginning of the buffer.

With this knowledge we can tell OpenGL how it should interpret the vertex data (per vertex attribute) using `GL::vertexAttribPointer`:

```java
gl.vertexAttribPointer(
        0,
        3,
        GL.FLOAT,
        (byte) GLFWConstants.FALSE,
        3 * Float.BYTES,
        MemorySegment.NULL
);
gl.enableVertexAttribArray(0);
```

The function `GL::vertexAttribPointer` has quite a few parameters so let's carefully walk through them:

- The first parameter specifies which vertex attribute we want to configure. Remember that we specified the location of the `position` vertex attribute in the vertex shader with `layout (location = 0)`. This sets the location of the vertex attribute to `0` and since we want to pass data to this vertex attribute, we pass in `0`.
- The next argument specifies the size of the vertex attribute. The vertex attribute is a `vec3` so it is composed of `3` values.
- The third argument specifies the type of the data which is `GL.FLOAT` (a `vec*` in GLSL consists of floating point values).
- The next argument specifies if we want the data to be normalized. If we're inputting integer data types (int, byte) and we've set this to `GL.TRUE`, the integer data is normalized to `0` (or `-1` for signed data) and `1` when converted to float. This is not relevant for us so we'll leave this at `GL.FALSE`.
- The fifth argument is known as the **stride** and tells us the space between consecutive vertex attributes. Since the next set of position data is located exactly 3 times the size of a float away we specify that value as the stride. Note that since we know that the array is tightly packed (there is no space between the next vertex attribute value) we could've also specified the stride as `0` to let OpenGL determine the stride (this only works when values are tightly packed). Whenever we have more vertex attributes we have to carefully define the spacing between each vertex attribute, but we'll get to see more examples of that later on.
- The last parameter is of type `void*` and thus requires the weird `MemorySegment.NULL`. This is the offset of where the position data begins in the buffer. Since the position data is at the start of the data array this value is just `0`. We will explore this parameter in more detail later on

> Each vertex attribute takes its data from memory managed by a VBO and which VBO it takes its data from (you can have multiple VBOs) is determined by the VBO currently bound to `GL.ARRAY_BUFFER` when calling `GL::vertexAttribPointer`. Since the previously defined VBO is still bound before calling `GL::vertexAttribPointer` vertex attribute `0` is now associated with its vertex data. 

Now that we specified how OpenGL should interpret the vertex data we should also enable the vertex attribute with `GL::enableVertexAttribArray` giving the vertex attribute location as its argument; vertex attributes are disabled by default. From that point on we have everything set up: we initialized the vertex data in a buffer using a vertex buffer object, set up a vertex and fragment shader and told OpenGL how to link the vertex data to the vertex shader's vertex attributes. Drawing an object in OpenGL would now look something like this: 

```java
// 0. copy our vertices array into a buffer for OpenGL to use
gl.bindBuffer(GL.ARRAY_BUFFER, vbo);
gl.bufferData(
        GL.ARRAY_BUFFER,
        pVertices.segment().byteSize(),
        pVertices.segment(),
        GL.STATIC_DRAW
);

// 1. then set the vertex attribute pointers
gl.vertexAttribPointer(
        0,
        3,
        GL.FLOAT,
        (byte) GLFWConstants.FALSE,
        3 * Float.BYTES,
        MemorySegment.NULL
);
gl.enableVertexAttribArray(0);

// 2. use our shader program when we want to render an object
gl.useProgram(shaderProgram);

// 3. now draw the object
someOpenGLFunctionThatDrawsOurTriangle();
```

We have to repeat this process every time we want to draw an object. It may not look like that much, but imagine if we have over 5 vertex attributes and perhaps 100s of different objects (which is not uncommon). Binding the appropriate buffer objects and configuring all vertex attributes for each of those objects quickly becomes a cumbersome process. What if there was some way we could store all these state configurations into an object and simply bind this object to restore its state?

## Vertex Array Object

A **vertex array object** (also known as **VAO**) can be bound just like a vertex buffer object and any subsequent vertex attribute calls from that point on will be stored inside the VAO. This has the advantage that when configuring vertex attribute pointers you only have to make those calls once and whenever we want to draw the object, we can just bind the corresponding VAO. This makes switching between different vertex data and attribute configurations as easy as binding a different VAO. All the state we just set is stored inside the VAO. 

> Core OpenGL **requires** that we use a VAO so it knows what to do with our vertex inputs. If we fail to bind a VAO, OpenGL will most likely refuse to draw anything. 

A vertex array object stores the following:

- Calls to `GL::enableVertexAttribArray` or `GL::disableVertexAttribArray`.
- Vertex attribute configurations via `GL::vertexAttribPointer`.
- Vertex buffer objects associated with vertex attributes by calls to `GL::vertexAttribPointer`.

![Vertex Array Object](../../images/vertex_array_objects.png)

The process to generate a VAO looks similar to that of a VBO:

```java
@Unsigned int vao;
@Unsigned IntPtr pVAO = IntPtr.allocate(arena);
gl.genVertexArrays(1, pVAO);
vao = pVAO.read();
```

To use a VAO all you have to do is bind the VAO using `GL::bindVertexArray`. From that point on we should bind/configure the corresponding VBO(s) and attribute pointer(s) and then unbind the VAO for later use. As soon as we want to draw an object, we simply bind the VAO with the preferred settings before drawing the object and that is it. In code this would look a bit like this: 

```java
// ..:: Initialization code (done once (unless your object frequently changes)) :: ..
// 1. bind Vertex Array Object
gl.bindVertexArray(vao);
// 2. copy our vertices array into a buffer for OpenGL to use
gl.bindBuffer(GL.ARRAY_BUFFER, vbo);
gl.bufferData(
        GL.ARRAY_BUFFER,
        pVertices.segment().byteSize(),
        pVertices.segment(),
        GL.STATIC_DRAW
);
// 3. then set our vertex attribute pointers
gl.vertexAttribPointer(
        0,
        3,
        GL.FLOAT,
        (byte) GLFWConstants.FALSE,
        3 * Float.BYTES,
        MemorySegment.NULL
);
gl.enableVertexAttribArray(0);

[...]

// ...:: Drawing code (in render loop) :: ..
// 4. draw the object
gl.useProgram(shaderProgram);
gl.bindVertexArray(vao);
someOpenGLFunctionThatDrawsOurTriangle();
```

And that is it! Everything we did the last few million pages led up to this moment, a VAO that stores our vertex attribute configuration and which VBO to use. Usually when you have multiple objects you want to draw, you first generate/configure all the VAOs (and thus the required VBO and attribute pointers) and store those for later use. The moment we want to draw one of our objects, we take the corresponding VAO, bind it, then draw the object and unbind the VAO again.

## The triangle we've all been waiting for

To draw our objects of choice, OpenGL provides us with the `GL::drawArrays` function that draws primitives using the currently active shader, the previously defined vertex attribute configuration and with the VBO's vertex data (indirectly bound via the VAO).

```java
gl.useProgram(shaderProgram);
gl.bindVertexArray(vao);
gl.drawArrays(GL.TRIANGLES, 0, 3);
```

The `GL::drawArrays` function takes as its first argument the OpenGL primitive type we would like to draw. Since I said at the start we wanted to draw a triangle, and I don't like lying to you, we pass in `GL.TRIANGLES`. The second argument specifies the starting index of the vertex array we'd like to draw; we just leave this at 0. The last argument specifies how many vertices we want to draw, which is 3 (we only render 1 triangle from our data, which is exactly 3 vertices long).

Now try to compile the code and work your way backwards if any errors popped up. As soon as your application compiles, you should see the following result:
