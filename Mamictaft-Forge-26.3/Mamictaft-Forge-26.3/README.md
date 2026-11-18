# Mamictaft - Forge 26.3 uyarlaması

Derleme (JDK 25 gerekir): `gradlew build` -> `build/libs/mamictaft-1.0.0.jar`
Test: `gradlew runClient`

NOT: Bu proje burada DERLENEMEDİ/TEST EDİLEMEDİ. Forge 26.3 API'sinde küçük derleme hataları çıkabilir; hata mesajını Claude'a atarsan düzeltir.

## Aktarılanlar
- 14 eşya (Adalium, Adalium Kümesi, Adalium Çekirdeği, Baltik Kovası, Isıran Bitki Tohumu, Baloncuk, Zincir, Çin Tapınağı, Rüzgar, 5 Fırlatma Diski) + texture + TR/EN dil
- 3 blok: Adalium Cevheri (mağarada oluşur, 1-2 Adalium düşürür), Atom Bombası (çakmakla patlar), Isıran Bitki (tohum düşürür)
- 12 tarif, loot table'lar, ore world generation
- Yaratıcı sekme "Mamictaft"

## Aktarılmayanlar (elle/ayrı yazılması gerekir)
- 9 özel yaratık (Dinozor, Karamelle, Mini Creeper, Ninja, Jöle, Şekerkoyun, Kristal Böcek, Fırlatma Diski ve Baloncuk varlıkları) + modeller/animasyonlar
- main.js oyun mantığı (zincirle bağlama, rüzgarla kaldırma, baloncuk hapsi, boomerang disk, Baltik Suyu, Çin Tapınağı, Arkadios portalı, başarımlar)
- Baltik Suyu ve Arkadios Portalı blokları
- Isıran Bitkinin büyüme aşamaları (şimdilik tek aşama)
