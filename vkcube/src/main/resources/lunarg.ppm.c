#include <stdio.h>
#include "lunarg.ppm.h"

int main() {
    FILE *fp = fopen("lunarg.bin", "wb");
    if (!fp) {
        fprintf(stderr, "Failed to open file lunarg.bin for writing\n");
        return 1;
    }

    if (fwrite(lunarg_ppm, 1, sizeof(lunarg_ppm), fp) != lunarg_ppm_len) {
        fprintf(stderr, "Failed to write lunarg.bin to file\n");
        fclose(fp);
        return 1;
    }

    fclose(fp);
    return 0;
}
