# Light Client - Minecraft 1.21.1 Fabric

Minecraft 1.21.1 için hafif, ban riski düşük bir Fabric client'ı.

## Özellikler

✅ **Xray** - Cevher blokları görmek (client-side only)
✅ **ESP** - Oyuncuların konumlarını görmek (render only)
✅ **Speed** - Hafif hız artırma (%5-15, insan gibi)
✅ **Inventory** - Eşya yönetimi ve analiz
✅ **GUI Menu** - Kolay ayar menüsü (`]` tuşu)

## Ban Riski

⚠️ **Uyarı**: Bu mod hafif özelliklere sahiptir ancak:
- Hile serbest sunucularda güvenlidir
- Normal sunucularda anticheat tarafından tespit edilebilir
- Ban riski her zaman vardır
- Kullanıcı sorumluluğu altındadır

## Teknik Detaylar

- **Platform**: Fabric Loader 1.21.1
- **Java**: 21+
- **Build Tool**: Gradle

## Dizin Yapısı

```
fabric-client/
├── build.gradle              # Gradle build config
├── gradle.properties         # Versiyon bilgileri
├── gradlew / gradlew.bat     # Gradle wrapper
├── src/
│   └── main/
│       ├── java/
│       │   └── com/example/lightclient/
│       │       ├── LightClientMod.java
│       │       ├── ConfigScreen.java
│       │       ├── features/
│       │       │   ├── XrayModule.java
│       │       │   ├── EspModule.java
│       │       │   ├── SpeedModule.java
│       │       │   └── InventoryModule.java
│       │       └── ui/
│       │           └── HudOverlay.java
│       └── resources/
│           ├── fabric.mod.json
│           └── lightclient.mixins.json
├── INSTALL.md                # Kurulum rehberi
└── README.md                 # Bu dosya
```

## Hızlı Başlangıç

### Windows
```bash
cd fabric-client
gradlew.bat build
```

### macOS / Linux
```bash
cd fabric-client
chmod +x gradlew
./gradlew build
```

Oluşan JAR dosyasını Minecraft mods klasörüne kopyala.

## Kontroller

- `]` - Ayar menüsünü aç/kapat

## Modüllerin Detayları

### Xray
- Elmas, altın, emerald, lapis lazuli, bakır, antik kalıntıları gösterir
- Tamamen client-side, sunucuya veri göndermiyor
- Diğer bloklar gizlenir

### ESP
- Oyuncuları yeşil renkle işaretler (sadece render)
- 100 blok mesafeye kadar gösterir
- Tamamen client-side

### Speed
- %5-15 arasında hız artırma
- İnsan benzeri hareket (çok hafif)
- Sadece hareket halinde çalışır

### Inventory
- Eşya sayısını gösterir
- Tool durability'sini kontrol eder
- Analiz yapar

## Geliştirme

IntelliJ IDEA ile:
```bash
./gradlew idea
```

Sonra IDEA'da projeyi aç.

## Lisans

MIT License

## Disclaimer

Bu proje eğitim amaçlıdır. Kullanıcı tüm sorumluluğu üstlenir.
- Hile serbest olmayan sunucularda kullanmayın
- Minecraft EULA'sına uygun kullanım yapın
- Ban yememek garantisi verilmez
