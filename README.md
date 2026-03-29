================================================================================
    LIGHT CLIENT - MINECRAFT 1.21.1 FABRIC
================================================================================

✅ KURULUM (3 ADIM):

[ADIM 1] - Gereksinimler:
  ✓ Java 21+ (https://www.oracle.com/java/technologies/downloads/)
  ✓ Minecraft Launcher
  ✓ Fabric Yüklenmiş (https://fabricmc.net/)

[ADIM 2] - Projeyi Derle:

  WINDOWS:
  --------
  1. KURULUM.bat dosyasını çift-tıkla
  2. Derlenmeyi bekle (ilk defa biraz uzun sürebilir)
  3. Seç: JAR dosyasını Mods klasörüne kopyala
  
  Alternatif (manual):
  - CMD aç, fabric-client klasöründe: gradlew.bat build
  
  
  LINUX / MAC:
  -----------
  1. Terminal aç, fabric-client klasörüne git: cd fabric-client
  2. Çalıştır: bash kurulum.sh
  3. Derlenmeyi bekle
  
  Alternatif (manual):
  - Terminal'de: ./gradlew build


[ADIM 3] - JAR'ı Kur:

  JAR dosyası şurada oluşacak:
  📁 build/libs/lightclient-1.0.0.jar
  
  Bunu şu klasöre kopyala:
  
  WINDOWS:
  %APPDATA%\.minecraft\mods\
  (Örnek: C:\Users\[Adınız]\AppData\Roaming\.minecraft\mods\)
  
  LINUX:
  ~/.minecraft/mods/
  
  MAC:
  ~/Library/Application Support/minecraft/mods/

================================================================================
  OYUNA BAŞLA
================================================================================

1. Minecraft Launcher aç
2. Profil seç: "Fabric" (ya da "Fabric 1.21.1")
3. "Play" tıkla
4. Oyunda SAĞ SHIFT tuşuna bas
5. Ayarlar menüsü açılacak!

================================================================================
  MODÜLLERİ KULLAN
================================================================================

SAĞ SHIFT  = Menüyü Aç/Kapat

Menüde şunlar var:
- XRAY      : ON/OFF (Cevherleri, chestleri, spawnerları görmek) ⭐
- ESP       : ON/OFF (Oyuncuları görmek)
- SPEED     : ON/OFF (Çok hafif hız artırma - %2-5)
- INVENTORY : ON/OFF (Eşya yönetimi)

================================================================================
  SORUN GIDERME
================================================================================

❌ JAR dosyası oluşmuyor:
   → Java 21+ yüklü mü kontrol et
   → Gradle build hatalarını oku
   → Tüm dosyaların mevcut olduğunu kontrol et

❌ Mod oyunda yüklenmiyor:
   → JAR dosyasını doğru klasöre kopyaladığını kontrol et
   → Minecraft'ı tamamen kapat ve aç
   → Logs'u kontrol et: .minecraft/logs/latest.log

❌ SAĞ SHIFT tuşu çalışmıyor:
   → Menü açıldı mı kontrol et (hiçbir hata vermeyebilir)
   → Farklı tuş denemek istersen: LightClientMod.java dosyasını düzenle
   → GLFW.GLFW_KEY_RIGHT_SHIFT'i başka tuşla değiştir (GLFW docs)

❌ Xray çalışmıyor:
   → Menüde açık mı kontrol et (ON olmalı)
   → Console'da "[Light Client] ✓ XRAY ENABLED" yazması lazım
   → Sunucu gerçekten hile serbest mi kontrol et

❌ Speed görmüyorum:
   → Çok hafif (%2-5) - çok dikkat etmen lazım
   → Menü kapa, ileri git, menü aç = daha net görünür

❌ Ban yedim!
   → Hile serbest olmayan sunucularda kullandığın anlaşılıyor
   → Sadece hile serbest sunucularda kullan!

================================================================================
  GÜVENLIK & BAN RİSKİ
================================================================================

✅ YAPILMIŞ GÜVENLIK ÖNLEMLERİ:

1. **Xray Koruma Geçme**
   - Sunucunun koyduğu opacity katmanını bypass etme
   - Cevherleri, chestleri, spawnerları gösterim
   - Diğer blokları gizleme = az veri = az tespit
   
2. **Ban Riskini Minimize Etme**
   - Tüm işlem client-side (sunucuya veri yok)
   - Çok hafif modifikasyonlar (detection zor)
   - Düzensiz pattern (linear tidak gözükmüyor)
   
3. **Speed Modülü Güvenlik**
   - Sadece %2-5 hız (çok hafif)
   - Sadece horizontal - vertical DEĞİL
   - Düzensiz pattern - suspicious görülmez

⚠️  BAN RİSKİ:

❌ Normal sunucularda:
   - Antiicheat seni yakalayabilir
   - Ban riski YÜKSEK
   - Garantisi YOK

✓  Hile serbest sunucularda:
   - Güvenli şekilde kullanılabilir
   - Ban riski ÇOK DÜŞÜK
   - Yine de olasılık var

📌 EN ÖNEMLİ KURAL: SADECE HİLE SERBEST SUNUCULARDA KULLAN!

================================================================================
  GELIŞTIRME (İsteğe Bağlı)
================================================================================

Kodu değiştirmek istersen:

1. IntelliJ IDEA kur (https://www.jetbrains.com/idea/download/)
2. fabric-client klasörü aç
3. Terminal'de çalıştır: ./gradlew idea
4. IDEA'da "Open" seç

Kod değiştirdikten sonra:
./gradlew build

================================================================================
  SORULAR & CEVAPLAR
================================================================================

S: Gerçekten ban yemeyeceği garantili mi?
C: Hayır. Hiçbir mod %100 güvenli değil. Risk var.

S: Wurst/Impact gibi güçlü mü?
C: Hayır. Bilerek hafif tutuldu. Ban riskini düşürmek için.

S: Hile serbest olmayan sunucularda çalışıyor mu?
C: Evet ama ban riski çok yüksek. KULLANMA!

S: Kontrolleri değiştirebilir miyim?
C: Evet. LightClientMod.java dosyasındaki tuş kodunu değiştir.

S: Başka modüller ekleyebilir miyim?
C: Evet. features/ klasörüne yeni modüller ekle.

================================================================================

Sorularını Twitter/Discord'da sorabileceğin bir komünite varsa oraya yazabilirsin.
İyi oyunlar! 🎮

================================================================================
