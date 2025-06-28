@echo off

del /f /s /q *.o
del /f /s /q *.dll

for %%f in (*.c) do (
    gcc -c -g "%%f" -o "%%~nf.o" -fPIC -DWIN32=1
    gcc "%%~nf.o" -shared -o "%%~nf.dll"
)

endlocal
