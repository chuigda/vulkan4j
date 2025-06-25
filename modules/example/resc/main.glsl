void main() {
    ivec2 pixelCoords = ivec2(gl_GlobalInvocationID.xy);
    ivec2 imageSize = imageSize(outputImage);

    float x = float(pixelCoords.x) / float(imageSize.x);
    float y = float(pixelCoords.y) / float(imageSize.y);

    vec4 color = vec4(x, y, 0.0, 1.0);
    imageStore(outputImage, pixelCoords, color);
}
