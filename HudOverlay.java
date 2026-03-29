╔════════════════════════════════════════════════════════════════════╗
║          VSCODE'DA LIGHT CLIENT DERLEMESI (ADIM ADIM)            ║
╚════════════════════════════════════════════════════════════════════╝

🎯 ADIM 1: VSCode'u Hazırla
════════════════════════════════════════════════════════════════════

1. VSCode'u aç (https://code.visualstudio.com/)

2. Sol sidebar'da Extensions'a tıkla (4 kare simgesi)

3. Şunları ara ve kur (arama kutusuna yaz):

   ✓ "Gradle for Java" (Microsoft)
   ✓ "Extension Pack for Java" (Microsoft)
   ✓ "Java Test Runner"

4. Kur butonlarına tıkla ve bekle (1-2 dakika)

════════════════════════════════════════════════════════════════════

🎯 ADIM 2: Projeyi VSCode'da Aç
════════════════════════════════════════════════════════════════════

1. VSCode'da: File → Open Folder

2. İndirdiğin fabric-client-READY.zip dosyasını açtığın
   "fabric-client" klasörünü seç

3. "Select Folder" tıkla

4. VSCode sağ üstte "Trust" mesajı gösterebilir → "Yes" tıkla

5. Biraz bekle... (Extension'lar yüklenecek)

════════════════════════════════════════════════════════════════════

🎯 ADIM 3: Gradle'i VSCode'da Kur
════════════════════════════════════════════════════════════════════

1. VSCode'da Alt+Shift+P tuşlarına bas
   (veya Ctrl+Shift+P → Command Palette açılır)

2. Şunu yaz:
   "Gradle: Show Gradle Tasks"

3. İlk sonucu seç

4. Eğer "Gradle not found" yazarsa:
   
   a) https://gradle.org/install/ git
   b) Windows Installer indir
   c) Kur (Next Next Finish)
   d) Windows'u yeniden başlat
   e) VSCode'u tekrar aç

════════════════════════════════════════════════════════════════════

🎯 ADIM 4: Derleyi Başlat (EN ÖNEMLİ)
════════════════════════════════════════════════════════════════════

SEÇENEK A: Terminal Üzerinden (Tavsiyelenen)
──────────────────────────────────────────

1. VSCode'da Terminal açmak için:
   - Ctrl+` (backtick) tuşunu bas
   - Veya: View → Terminal

2. Siyah terminal penceresi açılır

3. Şunu yazıp Enter'a bas:
   
   ./gradlew.bat build
   
   (Eğer hata alırsan: gradlew.bat build yaz)

4. BAŞLADI! Derlenmeyi izle! 🔥

   Şunları göreceksin:
   > Task :compileJava
   > Task :jar
   > Task :build

5. Biraz bekle... (ilk defa 3-5 dakika sürebilir)

6. Yeşil yazı görürsen: BUILD SUCCESS ✓

SEÇENEK B: GUI ile (Daha Kolay)
────────────────────────────

1. VSCode'da: Ctrl+Shift+P

2. Yaz: "Gradle: Run Gradle Task"

3. "build" seçeneğini seç

4. Otomatik derler!

════════════════════════════════════════════════════════════════════

🎯 ADIM 5: JAR Dosyasını Bul
════════════════════════════════════════════════════════════════════

Derlemeden sonra:

1. VSCode'un sol tarafında "Explorer" (dosya simgesi)

2. Klasörleri aç:
   fabric-client
   → build
   → libs
   → lightclient-1.0.0.jar

3. Bu dosya senin JAR'ın! 🎉

Görmüyorsan:
- VSCode'da F5'e bas (refresh)
- Veya: View → Explorer yenile

════════════════════════════════════════════════════════════════════

🎯 ADIM 6: JAR'ı Minecraft'a Kopyala
════════════════════════════════════════════════════════════════════

1. VSCode'da lightclient-1.0.0.jar dosyasına sağ tıkla

2. "Show in Explorer" seçeneğini tıkla
   (Dosya Yöneticisi açılır)

3. JAR dosyasını kopyala: Ctrl+C

4. Yeni bir Explorer penceresi aç
   (Windows Key + E)

5. Adres çubuğuna yazıp Enter:
   %APPDATA%\.minecraft\mods

6. Eğer "mods" klasörü yoksa:
   - Sağ tıkla → Yeni Klasör → "mods" isimle

7. JAR'ı yapıştır: Ctrl+V

8. Bitti! ✓

════════════════════════════════════════════════════════════════════

🎯 ADIM 7: Oyuna Gir ve Test Et
════════════════════════════════════════════════════════════════════

1. Minecraft Launcher aç

2. Profil: "Fabric 1.21.1" seç

3. "Play" tıkla

4. Oyunun başlamasını bekle (ilk defa slow olabilir)

5. Singleplayer ya da Multiplayer'a gir

6. Oyunda SAĞ SHIFT tuşuna bas

7. Menü açılmalı! 🎉

   ✓ XRAY
   ✓ ESP
   ✓ SPEED
   ✓ INVENTORY

════════════════════════════════════════════════════════════════════

⚠️ SORUN GIDERME
════════════════════════════════════════════════════════════════════

Problem: "gradlew.bat: command not found"
Çözüm: Klasörün doğru olduğunu kontrol et
       fabric-client klasörü içinde misin?

Problem: "Java not found"
Çözüm: Java 21 kur: https://www.oracle.com/java/

Problem: "BUILD FAILED"
Çözüm: 
- Terminal'deki hata mesajını oku
- İnterneti kontrol et
- VSCode'u yeniden aç

Problem: "JAR dosyası oluşmadı"
Çözüm: 
- "BUILD SUCCESS" yazarsa JAR var
- build/libs/ klasörüne bak
- Yok ise VSCode'u restart et

Problem: "Mod oyunda yüklenmiyor"
Çözüm:
- JAR'ı doğru klasöre kopyaladığını kontrol et
- Minecraft'ı tamamen kapat ve aç
- Logs'u kontrol et: .minecraft/logs/latest.log

════════════════════════════════════════════════════════════════════

💡 HIZLI İPUÇLARİ
════════════════════════════════════════════════════════════════════

✓ Terminal'i kapat/aç: Ctrl+` (backtick)
✓ Dosya arama: Ctrl+P (proje içinde dosya bul)
✓ Tekrar derlemek: Yukarı okla, Enter
✓ VSCode yavaşsa: Bazı extension'ları devre dış bırak

════════════════════════════════════════════════════════════════════

✅ BAŞARILI DERLEME MESAJI
════════════════════════════════════════════════════════════════════

Eğer şunu görürsen:

BUILD SUCCESSFUL in [zaman]
[task count] actionable tasks: [task count] executed

Bu demek oluyor: JAR dosyası başarıyla oluşturuldu! 🎉

Sonra:
1. JAR'ı Minecraft mods klasörüne kopyala
2. Oyun başlat
3. SAĞ SHIFT = Menü
4. Modülleri aç!

════════════════════════════════════════════════════════════════════

🚀 HADI BAŞLAYALIM!

Şimdi:
1. VSCode aç
2. fabric-client klasörünü aç
3. Terminal aç (Ctrl+`)
4. Yazıp Enter: ./gradlew.bat build

Başlandıysa sonda mesaj at! 💪

════════════════════════════════════════════════════════════════════
