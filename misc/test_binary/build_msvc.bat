rem You need to setup MSVC environment on yourself. For example:
rem call "C:\Program Files\Microsoft Visual Studio\2022\Community\VC\Auxiliary\Build\vcvars64.bat"

@echo off

rem Nobody knows why MSVC compiler generates so many garbage files.
del /f /s /q *.obj
del /f /s /q *.dll
del /f /s /q *.lib
del /f /s /q *.pdb
del /f /s /q *.ilk
del /f /s /q *.exp

for %%f in (*.c) do (
    cl.exe /nologo /LD /MD /Zi "%%f" /Fe:"%%~nf.dll"
)
