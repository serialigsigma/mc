@echo off
REM Light Client Kurulum Script'i - Windows

echo ===================================
echo Light Client Fabric Installer
echo ===================================
echo.

if not exist "gradlew.bat" (
    echo HATA: gradlew.bat bulunamadi!
    echo Dosyayi fabric-client dizininde calistir.
    pause
    exit /b 1
)

echo [1/3] Gradle wrapper indiriliyor...
call gradlew.bat wrapper > nul 2>&1

echo [2/3] Mod derleniyyor...
call gradlew.bat build

echo [3/3] Tamamlandi!
echo.
echo JAR dosyasi olusturuldu: build\libs\lightclient-1.0.0.jar
echo.
echo SONRAKI ADIM:
echo 1. JAR dosyasini: %%APPDATA%%\.minecraft\mods\ klasorune kopyala
echo 2. Minecraft'i ac ve Fabric profile'ini sec
echo 3. Oyuna gir!
echo.
pause
