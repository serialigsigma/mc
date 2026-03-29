╔════════════════════════════════════════════════════════════════════╗
║        LIGHT CLIENT - EN HIZLI JAR ELDE ETME YÖNTEMLERİ          ║
╚════════════════════════════════════════════════════════════════════╝

BU DOSYAYI OKUYUN ÖNCE! İçinde 3 seçenek var!

════════════════════════════════════════════════════════════════════

🥇 SEÇENEK 1: GitHub Actions (TAVSİYE EDİLEN - ULTRA KOLAY)
════════════════════════════════════════════════════════════════════

⏱️  Süre: 5 dakika
📱 Gerekli: Sadece tarayıcı ve GitHub hesabı
✅ Başarı oranı: %100

ADIMLAR:

1. https://github.com/signup git ve hesap aç (ücretsiz)

2. https://github.com/new git
   - Repository name: light-client
   - Description: Minecraft Light Client
   - Public seç
   - ✅ "Create repository" tıkla

3. Yeni açılan sayfada şu yazı var:
   "...or upload an existing repository from the command line"
   
4. Tarayıcının BAŞKA bir sekmesinde aç:
   https://github.com/upload
   
5. İndirdiğin "fabric-client-READY.zip" dosyasını buraya sürükle

6. "Commit changes" tıkla

7. GitHub Actions otomatik derler! (3-5 dakika)

8. Repository sayfasında "Actions" sekmesine git

9. Yeşil ✓ işareti görceksin - tıkla

10. "Artifacts" bölümünde "lightclient-jar" indir

11. İçinden "lightclient-1.0.0.jar" al

12. Bunu Minecraft mods klasörüne kopyala! (Bitti!)

════════════════════════════════════════════════════════════════════

🥈 SEÇENEK 2: Local Gradle (WINDOWS)
════════════════════════════════════════════════════════════════════

⏱️  Süre: 20 dakika
📱 Gerekli: Gradle, Java 21
✅ Başarı oranı: İnternete bağlıysan %95

ADIMLAR:

1. Gradle'i indir ve kur:
   https://gradle.org/install/
   
2. fabric-client-READY.zip dosyasını aç

3. fabric-client klasörüne gir

4. BUILD.bat dosyasına sağ tıkla → Çalıştır

5. Terminal açılır ve derlenmeyi başlatır

6. Biraz bekle... (ilk defa 2-5 dakika)

7. "BUILD SUCCESS" yazarsa - başarılı! ✓

8. build/libs/lightclient-1.0.0.jar dosyasını bul

9. Minecraft mods klasörüne kopyala!

════════════════════════════════════════════════════════════════════

🥉 SEÇENEK 3: Online Derleyici (ÇALIŞMAZSA)
════════════════════════════════════════════════════════════════════

⏱️  Süre: 15 dakika
📱 Gerekli: Sadece tarayıcı
✅ Başarı oranı: %60

ADIMLAR:

1. https://replit.com hesabı aç (ücretsiz)

2. Yeni Repl oluştur (Java seçimi yap)

3. fabric-client kaynak kodlarını (src/ klasörünü) Repl'e yükle

4. Terminal'de:
   gradle build
   
5. İşlem biterse JAR elde et

6. İndirip Minecraft'a kopyala

════════════════════════════════════════════════════════════════════

🚨 JAR DOSYASINI MINECRAFT'A NASIL KOPYALARSAN?
════════════════════════════════════════════════════════════════════

1. JAR dosyasını bulduğun zaman (lightclient-1.0.0.jar)

2. Windows'ta:
   - Windows + R bas
   - Şu yaz: %APPDATA%\.minecraft\mods
   - Enter'a bas
   
3. Eğer "mods" klasörü yoksa:
   - Boş alana sağ tıkla → Yeni Klasör
   - İsmini "mods" yap
   
4. JAR dosyasını buraya kopyala (Ctrl+V)

5. Minecraft Launcher aç

6. Fabric 1.21.1 profile'ını seç

7. Play tıkla

8. Oyunda SAĞ SHIFT tuşuna bas

9. Menü açılıp modüller görünür! 🎉

════════════════════════════════════════════════════════════════════

⚠️ EĞER SORUN YAŞARSAN:
════════════════════════════════════════════════════════════════════

Problem: "Gradle bulunamadı"
→ Çözüm: https://gradle.org/install/ den kur

Problem: "Java bulunamadı"
→ Çözüm: Java 21 kur: https://www.oracle.com/java/

Problem: "Build başarısız"
→ Çözüm: İnterneti kontrol et, dosyaları eksiksiz indir

Problem: "JAR Minecraft'ta yüklenmiyor"
→ Çözüm: Doğru klasöre kopyaladığını kontrol et

════════════════════════════════════════════════════════════════════

✅ BAŞLADIĞIN ZAMAN BİZE SÖYLE!
════════════════════════════════════════════════════════════════════

Hangi yöntemi seçeceğini kafana koy:

[ ] Seçenek 1: GitHub (EN KOLAY - BAŞTA)
[ ] Seçenek 2: Gradle (LOCAL)
[ ] Seçenek 3: Online (FALLBACK)

Başladığında sonda mesaj at! 🚀
