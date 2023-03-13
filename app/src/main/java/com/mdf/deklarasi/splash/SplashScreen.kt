package com.mdf.deklarasi.splash

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.mdf.deklarasi.R
import com.mdf.deklarasi.database.DatabaseErrorListener
import com.mdf.deklarasi.database.DatabaseSuccessListener
import com.mdf.deklarasi.database.IDeclarationDatabase
import com.mdf.deklarasi.databinding.ActivitySplashScreenBinding
import com.mdf.deklarasi.main.MainActivity
import com.mdf.deklarasi.model.*
import com.mdf.deklarasi.utilities.AppConfiguration
import com.mdf.deklarasi.utilities.UserConfiguration

class SplashScreen : AppCompatActivity() {

    private lateinit var binding: ActivitySplashScreenBinding
    private lateinit var database: IDeclarationDatabase

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_splash_screen)
        database =
            AppConfiguration.getInstance().getDeclarationDatabase(this)
        supportActionBar?.hide()

//        if (UserConfiguration.getInstance().getCompleteFillData()) {
//            openMainActivity()
//        } else {
//            initData()
//        }
        initData()
    }

    private fun initData() {
        insertDeclarationData()
    }

    private fun insertDeclarationData() {
        val mdfDeclaration = Declaration(
            "declaration_sma_mdf",
            "S.M.A (MDF)",
            resources.getString(R.string.dek_sma_mdf),
            true,
            "layout_dek_sma_mdf",
            "tv_1, tv_2, tv_3, tv_4, tv_5, tv_6, tv_7, tv_8, tv_9, tv_10, tv_11, tv_12, tv_13, tv_14, tv_15, tv_16, tv_17, tv_18, tv_19"
        )

        val bahteraDelcaration = Declaration(
            "declaration_bahtera_mdf",
            "S.M.A (Bahtera)",
            resources.getString(R.string.dek_sma_bahtera),
            false,
            "layout_dek_sma_bahtera",
            "tv_1, tv_2, tv_3, tv_4, tv_5, tv_6, tv_7, tv_8, tv_9, tv_10, tv_11, tv_12, tv_13, tv_14, tv_15, tv_16"
        )

        val kendalikanAtmosferTiapPagi = Declaration(
            "kendalikan_atmosfer_setiap_pagi",
            "Deklarasi Kendalikan Atmosfer Setiap Pagi",
            resources.getString(R.string.kendalikan_atmosfer_tiap_pagi),
            false,
            "layout_kendalikan_atmosfer_tiap_pagi",
            "tv_1, tv_2, tv_3, tv_4"
        )

        val tembokPerlindunganDeclaration = Declaration(
            "declaration_tembok_perlindungan",
            "Deklarasi 35 Tembok Perlindungan",
            resources.getString(R.string.dek_tembok_perlindungan),
            false,
            "layout_tembok_perlindungan",
            "tv_1, tv_2, tv_3, tv_4, tv_5, tv_6, tv_7, tv_8, tv_9, tv_10, tv_11, tv_12, tv_13, tv_14, tv_15, tv_16, tv_17," +
                    " tv_18, tv_19, tv_20, tv_21, tv_22, tv_22, tv_23, tv_24, tv_25, tv_26, tv_27, tv_28, tv_29, tv_30, tv_31, tv_32," +
                    " tv_33, tv_34, tv_35, tv_36, tv_37, tv_38, tv_39, tv_40, tv_41, tv_42, tv_43, tv_44, tv_45, tv_46, tv_47, tv_48," +
                    " tv_49, tv_50, tv_51, tv_52, tv_53, tv_54, tv_55, tv_56, tv_57, tv_58, tv_59, tv_60, tv_61, tv_62, tv_63, tv_64, tv_65," +
                    " tv_66, tv_67, tv_68, tv_69, tv_70, tv_71, tv_72, tv_73,"
        )

        val perjanjianDarah = Declaration(
            "perjanjian_darah",
            "Deklarasi Perjanjian Darah",
            resources.getString(R.string.dek_perjanjian_darah),
            false,
            "layout_dek_perjanjian_darah",
            "tv_1, tv_2"
        )

        val perjanjianGaram = Declaration(
            "perjanjian_garam",
            "Deklarasi Perjanjian Garam",
            resources.getString(R.string.dek_perjanjian_garam),
            false,
            "layout_dek_perjanjian_garam",
            "tv_1, tv_2"
        )

        val perjanjianPelangi1 = Declaration(
            "perjanjian_pelangi_1",
            "Deklarasi Perjanjian Pelangi 1",
            resources.getString(R.string.dek_perjanjian_pelangi_1),
            false,
            "layout_dek_perjanjian_pelangi_1",
            "tv_1, tv_2"
        )

        val perjanjianPelangi2 = Declaration(
            "perjanjian_pelangi_2",
            "Deklarasi Perjanjian Pelangi 2",
            resources.getString(R.string.dek_perjanjian_pelangi_2),
            false,
            "layout_dek_perjanjian_pelangi_2",
            "tv_1, tv_2"
        )

        val deklarasiMazmur91 = Declaration(
            "mazmur_91",
            "Deklarasi Mazmur 91 (Perlindungan)",
            resources.getString(R.string.dek_mazmur_91),
            false,
            "layout_dek_mazmur_91",
            "tv_1, tv_2"
        )

        val perpindahanKekayaan = Declaration(
            "perpindahan_kekayaan",
            "Deklarasi Perpindahan Kekayaan",
            resources.getString(R.string.dek_perpindahan_kekayaan),
            false,
            "layout_dek_perpindahan_kekayaan",
            "tv_1, tv_2"
        )

        val deklarasi7Meterai = Declaration(
            "7_meterai",
            "Deklarasi 7 Perjanjian & Meterai",
            resources.getString(R.string.dek_perjanjian_dan_meterai),
            false,
            "layout_perjanjian_dan_meterai",
            "tv_1, tv_2, tv_3, tv_4, tv_5, tv_6, tv_7, tv_8, tv_9, tv_10, tv_11, tv_12, tv_13,"
        )

        val yesaya60 = Declaration(
            "yesaya_60",
            "Deklarasi Yesaya 60 Pemulihan Dan Kelimpahan",
            resources.getString(R.string.dek_yesaya_60),
            false,
            "layout_dek_yesaya_60",
            "tv_1, tv_2"
        )

        val perjanjianMatahari = Declaration(
            "perjanjian_matahari",
            "Deklarasi Perjanjian Matahari",
            resources.getString(R.string.perjanjian_matahari),
            false,
            "",
            "tv_1, tv_2, tv_3, tv_4, tv_5, tv_6, tv_7, tv_8, tv_9, tv_10, tv_11, tv_12, tv_13,"
        )

        val perjanjianBintang = Declaration(
            "perjanjian_bintang",
            "Deklarasi Perjanjian Bintang",
            resources.getString(R.string.perjanjian_bintang),
            false,
            "",
            "tv_1, tv_2, tv_3, tv_4, tv_5, tv_6, tv_7, tv_8, tv_9, tv_10, tv_11, tv_12, tv_13,"
        )

        val everlastingCovenant = Declaration(
            "everlasting_covenant",
            "Everlasting Covenant (Kasih Setia Tuhan) - 2022",
            resources.getString(R.string.everlasting_covenant),
            false,
            "",
            "tv_1, tv_2, tv_3, tv_4, tv_5, tv_6, tv_7, tv_8, tv_9, tv_10, tv_11, tv_12, tv_13,"
        )

        val membangunTembokIlahi = Declaration(
            "membangun_tembok_ilahi",
            "Deklarasi Membangun Tembok Ilahi",
            resources.getString(R.string.membangun_tembok_ilahi),
            false,
            "",
            "tv_1, tv_2, tv_3, tv_4, tv_5, tv_6, tv_7, tv_8, tv_9, tv_10, tv_11, tv_12, tv_13,"
        )

        val mematahkanKutuk = Declaration(
            "mematahkan_kutuk",
            "Deklarasi Mematahkan Kutuk",
            resources.getString(R.string.mematahkan_kutuk),
            false,
            "",
            "tv_1, tv_2, tv_3, tv_4, tv_5, tv_6, tv_7, tv_8, tv_9, tv_10, tv_11, tv_12, tv_13,"
        )

        val perlindunganKesehatan = Declaration(
            "perlindungan_kesehatan",
            "Deklarasi Perlindungan Kesehatan",
            resources.getString(R.string.perlindungan_kesehatan),
            false,
            "",
            "tv_1, tv_2, tv_3, tv_4, tv_5, tv_6, tv_7, tv_8, tv_9, tv_10, tv_11, tv_12, tv_13,"
        )

        val perjanjianPersepuluhan = Declaration(
            "perjanjian_persepuluhan",
            "Deklarasi Perjanjian Persepuluhan",
            resources.getString(R.string.perjanjian_persepuluhan),
            false,
            "",
            "tv_1, tv_2, tv_3, tv_4, tv_5, tv_6, tv_7, tv_8, tv_9, tv_10, tv_11, tv_12, tv_13,"
        )

        val pelayananMalaikat = Declaration(
            "pelayanan_malaikat",
            "Deklarasi Pelayanan Malaikat",
            resources.getString(R.string.pelayanan_malaikat),
            false,
            "",
            "tv_1, tv_2, tv_3, tv_4, tv_5, tv_6, tv_7, tv_8, tv_9, tv_10, tv_11, tv_12, tv_13,"
        )

        val pengakuanPanggilanImam = Declaration(
            "panggilan_imam",
            "Deklarasi Pengakuan Panggilan Imam",
            resources.getString(R.string.panggilan_imam),
            false,
            "",
            "tv_1, tv_2, tv_3, tv_4, tv_5, tv_6, tv_7, tv_8, tv_9, tv_10, tv_11, tv_12, tv_13,"
        )

        val pengakuanPanggilanMempelai = Declaration(
            "panggilan_mempelai",
            "Deklarasi Pengakuan Panggilan Mempelai",
            resources.getString(R.string.panggilan_mempelai),
            false,
            "",
            "tv_1, tv_2, tv_3, tv_4, tv_5, tv_6, tv_7, tv_8, tv_9, tv_10, tv_11, tv_12, tv_13,"
        )

        val pengakuanPanggilanPekerja = Declaration(
            "panggilan_pekerja",
            "Deklarasi Pengakuan Panggilan Pekerja",
            resources.getString(R.string.panggilan_pekerja),
            false,
            "",
            "tv_1, tv_2, tv_3, tv_4, tv_5, tv_6, tv_7, tv_8, tv_9, tv_10, tv_11, tv_12, tv_13,"
        )

        val pengakuanPanggilanPilar = Declaration(
            "panggilan_pilar",
            "Deklarasi Pengakuan Panggilan Pilar",
            resources.getString(R.string.panggilan_pilar),
            false,
            "",
            "tv_1, tv_2, tv_3, tv_4, tv_5, tv_6, tv_7, tv_8, tv_9, tv_10, tv_11, tv_12, tv_13,"
        )

        val pengakuanPanggilanRaja = Declaration(
            "panggilan_raja",
            "Deklarasi Pengakuan Panggilan Raja",
            resources.getString(R.string.panggilan_raja),
            false,
            "",
            "tv_1, tv_2, tv_3, tv_4, tv_5, tv_6, tv_7, tv_8, tv_9, tv_10, tv_11, tv_12, tv_13,"
        )

        val pengakuanPanggilanTentara = Declaration(
            "panggilan_tentara",
            "Deklarasi Pengakuan Panggilan Tentara",
            resources.getString(R.string.panggilan_tentara),
            false,
            "",
            "tv_1, tv_2, tv_3, tv_4, tv_5, tv_6, tv_7, tv_8, tv_9, tv_10, tv_11, tv_12, tv_13,"
        )

        val kutukBulanApril = Declaration(
            "kutuk_bulan_april",
            "Deklarasi Mematahkan Kutuk Bulan April",
            resources.getString(R.string.kutuk_bulan_april),
            false,
            "",
            "tv_1, tv_2, tv_3, tv_4, tv_5, tv_6, tv_7, tv_8, tv_9, tv_10, tv_11, tv_12, tv_13,"
        )

        val kutukBulanAgustus = Declaration(
            "kutuk_bulan_agustus",
            "Deklarasi Mematahkan Kutuk Bulan Agustus",
            resources.getString(R.string.kutuk_bulan_agustus),
            false,
            "",
            "tv_1, tv_2, tv_3, tv_4, tv_5, tv_6, tv_7, tv_8, tv_9, tv_10, tv_11, tv_12, tv_13,"
        )

        val perjanjianAbraham = Declaration(
            "perjanjian_abraham",
            "Deklarasi Perjanjian Abraham",
            resources.getString(R.string.perjanjian_abraham),
            false,
            "",
            "tv_1, tv_2, tv_3, tv_4, tv_5, tv_6, tv_7, tv_8, tv_9, tv_10, tv_11, tv_12, tv_13,"
        )


        val declarationList = arrayListOf<Declaration>()
        declarationList.add(mdfDeclaration)
        declarationList.add(bahteraDelcaration)
        declarationList.add(tembokPerlindunganDeclaration)
        declarationList.add(kendalikanAtmosferTiapPagi)
        declarationList.add(perjanjianDarah)
        declarationList.add(perjanjianGaram)
        declarationList.add(perjanjianPelangi1)
        declarationList.add(perjanjianPelangi2)
        declarationList.add(deklarasiMazmur91)
        declarationList.add(perpindahanKekayaan)
        declarationList.add(deklarasi7Meterai)
        declarationList.add(yesaya60)
        declarationList.add(perjanjianMatahari)
        declarationList.add(perjanjianBintang)
        declarationList.add(everlastingCovenant)
        declarationList.add(membangunTembokIlahi)
        declarationList.add(mematahkanKutuk)
        declarationList.add(perlindunganKesehatan)
        declarationList.add(perjanjianPersepuluhan)
        declarationList.add(pelayananMalaikat)
        declarationList.add(pengakuanPanggilanImam)
        declarationList.add(pengakuanPanggilanMempelai)
        declarationList.add(pengakuanPanggilanPekerja)
        declarationList.add(pengakuanPanggilanRaja)
        declarationList.add(pengakuanPanggilanPilar)
        declarationList.add(pengakuanPanggilanTentara)
        declarationList.add(kutukBulanApril)
        declarationList.add(kutukBulanAgustus)
        declarationList.add(perjanjianAbraham)

        database.insertDeclaration(declarationList, getDatabaseSuccessListener(), errorListener())
    }

    private fun insertSpiritualWarfareVerseData() {
        val mintaOtoritasKerajaanSorga = SpiritualWarfareVerse(
            "ayat_minta_otoritas_kerajaan_sorga",
            "Minta Otoritas Kerajaan Sorga",
            emptyList(),
            resources.getString(R.string.ayat_minta_otoritas_kerajaan_sorga)
        )

        val malaikatPerang = SpiritualWarfareSubCategory(
            "malaikat_perang",
            "Malaikat Perang",
            resources.getString(R.string.malaikat_perang)
        )

        val malaikatPenerobos = SpiritualWarfareSubCategory(
            "malaikat_penerobos",
            "Malaikat Penerobos",
            resources.getString(R.string.malaikat_penerobos)
        )

        val malaikatMujizat = SpiritualWarfareSubCategory(
            "malaikat_mujizat",
            "Malaikat Mujizat",
            resources.getString(R.string.malaikat_mujizat)
        )

        val malaikatPengawalBerkat = SpiritualWarfareSubCategory(
            "malaikat_berkat",
            "Malaikat Pengawal Berkat",
            resources.getString(R.string.malaikat_berkat)
        )

        val malaikatPenuaian = SpiritualWarfareSubCategory(
            "malaikat_penuaian_jiwa",
            "Malaikat Penuaian dan Lawatan Jiwa-Jiwa",
            resources.getString(R.string.malaikat_penuaian_jiwa)
        )

        val malaikatBenih = SpiritualWarfareSubCategory(
            "malaikat_benih",
            "Malaikat Pembawa Benih",
            resources.getString(R.string.malaikat_benih)
        )

        val malaikatKekudusan = SpiritualWarfareSubCategory(
            "malaikat_kekudusan",
            "Malaikat Kekudusan",
            resources.getString(R.string.malaikat_kekudusan)
        )

        val malaikatKeadilan = SpiritualWarfareSubCategory(
            "malaikat_keadilan",
            "Malaikat Keadilan",
            resources.getString(R.string.malaikat_keadilan)
        )

        val malaikatPenyembahan = SpiritualWarfareSubCategory(
            "malaikat_pujian",
            "Malaikat Penyembahan",
            resources.getString(R.string.malaikat_pujian)
        )

        val malaikatKarakter = SpiritualWarfareSubCategory(
            "malaikat_karakter",
            "Malaikat Karakter dan Kabod",
            resources.getString(R.string.malaikat_karakter)
        )

        val malaikatPerjanjian = SpiritualWarfareSubCategory(
            "malaikat_perjanjian",
            "Malaikat Perjanjian",
            resources.getString(R.string.malaikat_perjanjian)
        )

        val malaikatPengangkatan = SpiritualWarfareSubCategory(
            "malaikat_pengangkatan",
            "Malaikat Pengangkatan",
            resources.getString(R.string.malaikat_pengangkatan)
        )
        val mintaLayananMalaikatSubCategory = arrayListOf<SpiritualWarfareSubCategory>()
        mintaLayananMalaikatSubCategory.add(malaikatPerang)
        mintaLayananMalaikatSubCategory.add(malaikatPenerobos)
        mintaLayananMalaikatSubCategory.add(malaikatMujizat)
        mintaLayananMalaikatSubCategory.add(malaikatPengawalBerkat)
        mintaLayananMalaikatSubCategory.add(malaikatPenuaian)
        mintaLayananMalaikatSubCategory.add(malaikatBenih)
        mintaLayananMalaikatSubCategory.add(malaikatKekudusan)
        mintaLayananMalaikatSubCategory.add(malaikatKeadilan)
        mintaLayananMalaikatSubCategory.add(malaikatPenyembahan)
        mintaLayananMalaikatSubCategory.add(malaikatKarakter)
        mintaLayananMalaikatSubCategory.add(malaikatPerjanjian)
        mintaLayananMalaikatSubCategory.add(malaikatPengangkatan)

        val mintaLayananMalaikat = SpiritualWarfareVerse(
            "ayat_minta_layanan_malaikat",
            "Minta Layanan Malaikat",
            mintaLayananMalaikatSubCategory,
            ""
        )

        val mintaKekuatanDariTuhan = SpiritualWarfareVerse(
            "ayat_minta_kekuatan_dari_tuhan",
            "Minta Kekuatan Dari Tuhan",
            emptyList(),
            resources.getString(R.string.ayat_minta_kekuatan_dari_tuhan)
        )

        val mintaPerlindunganDariTuhan = SpiritualWarfareVerse(
            "ayat_minta_perlindungan_dari_tuhan",
            "Minta Perlindungan Dari Tuhan",
            emptyList(),
            resources.getString(R.string.ayat_minta_perlindungan_dari_tuhan)
        )

        val ketetapanTuhan = SpiritualWarfareVerse(
            "ayat_ketetapan_tuhan",
            "Ketetapan Tuhan",
            emptyList(),
            resources.getString(R.string.ayat_ketetapan_tuhan)
        )

        val tarikBerkat = SpiritualWarfareVerse(
            "ayat_tarik_berkat",
            "Tarik Berkat",
            emptyList(),
            resources.getString(R.string.ayat_tarik_berkat)
        )

        val melawanMalaikatJatuh = SpiritualWarfareVerse(
            "ayat_melawan_malaikat_jatuh",
            "Melawan Malaikat Jatuh",
            emptyList(),
            resources.getString(R.string.ayat_melawan_malaikat_jatuh)
        )

        val melawanRohPenyesat = SpiritualWarfareVerse(
            "ayat_melawan_roh_penyesat",
            "Melawan Roh Penyesat",
            emptyList(),
            resources.getString(R.string.ayat_melawan_roh_penyesat)
        )

        val melawanRohMaut = SpiritualWarfareVerse(
            "ayat_melawan_roh_maut",
            "Melawan Roh Maut",
            emptyList(),
            resources.getString(R.string.ayat_melawan_roh_maut)
        )

        val melawanBerhala = SpiritualWarfareVerse(
            "ayat_melawan_berhala",
            "Melawan Berhala",
            emptyList(),
            resources.getString(R.string.ayat_melawan_berhala)
        )

        val melawanRohKedar = SpiritualWarfareVerse(
            "ayat_melawan_roh_kedar",
            "Melawan Roh Kedar",
            emptyList(),
            resources.getString(R.string.ayat_melawan_roh_kedar)
        )

        val melawanTenung = SpiritualWarfareVerse(
            "ayat_melawan_tenung",
            "Melawan Mentera/Tenung",
            emptyList(),
            resources.getString(R.string.ayat_melawan_tenung)
        )

        val melawanPembinasaKeji = SpiritualWarfareVerse(
            "ayat_melawan_pembinasa_keji",
            "Melawan Pembinasa Keji",
            emptyList(),
            resources.getString(R.string.ayat_melawan_pembinasa_keji)
        )

        val melawanRohMamon = SpiritualWarfareVerse(
            "ayat_melawan_roh_mamon",
            "Melawan Roh Mamon",
            emptyList(),
            resources.getString(R.string.ayat_melawan_roh_mamon)
        )

        val melawanRohUlar = SpiritualWarfareVerse(
            "ayat_melawan_roh_ular",
            "Melawan Roh Ular/Naga",
            emptyList(),
            resources.getString(R.string.melawan_roh_ular)
        )

        val spiritualWarfareVerses = arrayListOf<SpiritualWarfareVerse>()
        spiritualWarfareVerses.add(mintaOtoritasKerajaanSorga)
        spiritualWarfareVerses.add(mintaLayananMalaikat)
        spiritualWarfareVerses.add(mintaKekuatanDariTuhan)
        spiritualWarfareVerses.add(mintaPerlindunganDariTuhan)
        spiritualWarfareVerses.add(ketetapanTuhan)
        spiritualWarfareVerses.add(tarikBerkat)
        spiritualWarfareVerses.add(melawanMalaikatJatuh)
        spiritualWarfareVerses.add(melawanRohPenyesat)
        spiritualWarfareVerses.add(melawanRohMaut)
        spiritualWarfareVerses.add(melawanBerhala)
        spiritualWarfareVerses.add(melawanRohKedar)
        spiritualWarfareVerses.add(melawanTenung)
        spiritualWarfareVerses.add(melawanPembinasaKeji)
        spiritualWarfareVerses.add(melawanRohMamon)
        spiritualWarfareVerses.add(melawanRohUlar)
        database.insertSpiritualWarfareVerse(
            spiritualWarfareVerses,
            getSpiritualWarfareVerseDatabaseSuccessListener(),
            errorListener()
        )
    }

    private fun insertShofarSoundData() {
        val shofar = ShofarSound("short", "Shofar 12x", "shofar", "shofarblower1")
        val shofarLong = ShofarSound("long", "Shofar Panjang", "shofarlong", "shofarblower2")

        val shofarSounds = arrayListOf<ShofarSound>()
        shofarSounds.add(shofar)
        shofarSounds.add(shofarLong)

        database.insertShofarSound(shofarSounds, getShofarSoundDatabaseListener(), errorListener())
    }

    private fun insertLibraryData() {
        val proseduralDoling = Library(
            "prosedural_doling",
            "Prosedural Doling",
            emptyList(),
            resources.getString(R.string.prosedural_doling),
            ""
        )

        val namaNamaTuhan = Library(
            "nama_nama_tuhan",
            "Nama Nama Tuhan",
            emptyList(),
            resources.getString(R.string.nama_nama_tuhan),
            ""
        )

        val perjanjianDaniel = SubLibrary(
            "perjanjian_daniel",
            "Perjanjian Daniel",
            resources.getString(R.string.perjanjian_daniel),
            "daniel"
        )

        val perjanjianGaram = SubLibrary(
            "perjanjian_garam",
            "Perjanjian Garam",
            resources.getString(R.string.perjanjian_garam),
            "garam"
        )

        val perjanjianPersepuluhan = SubLibrary(
            "perjanjian_perpuluhan",
            "Perjanjian Persepuluhan",
            resources.getString(R.string.perjanjian_perpuluhan),
            "perpuluhan"
        )

        val perjanjianDarah = SubLibrary(
            "perjanjian_darah",
            "Perjanjian Darah",
            resources.getString(R.string.perjanjian_darah),
            "darah"
        )

        val perjanjianAnakSulung = SubLibrary(
            "perjanjian_anak_sulung",
            "Perjanjian Anak Sulung",
            resources.getString(R.string.perjanjian_anak_sulung),
            "kesulungan"
        )

        val perjanjianPelangi = SubLibrary(
            "perjanjian_pelangi",
            "Perjanjian Pelangi",
            resources.getString(R.string.perjanjian_pelangi),
            "pelangi"
        )

        val perjanjiaAbraham = SubLibrary(
            "perjanjian_abraham",
            "Perjanjian Abaraham",
            resources.getString(R.string.pengajaran_perjanjian_abraham),
            "abraham"
        )

        val subLibraries = arrayListOf<SubLibrary>()
        subLibraries.add(perjanjianDaniel)
        subLibraries.add(perjanjianGaram)
        subLibraries.add(perjanjianPersepuluhan)
        subLibraries.add(perjanjianDarah)
        subLibraries.add(perjanjianAnakSulung)
        subLibraries.add(perjanjianPelangi)
        subLibraries.add(perjanjiaAbraham)

        val tujuhPerjanjian = Library(
            "tujuh_perjanjian",
            "7 Perjanjian (Legalitas dan Cawan)",
            subLibraries,
            resources.getString(R.string.nama_nama_tuhan),
            ""
        )

        val pengertianTumen = Library(
            "tumen",
            "Pengertian 7 Elemen (TUMEN)",
            emptyList(),
            resources.getString(R.string.pengertian_tumen),
            ""
        )

        val layananMalaikat = Library(
            "layanan_malaikat",
            "12 Layanan Malaikat Tuhan",
            emptyList(),
            resources.getString(R.string.layanan_malaikat),
            ""
        )

        val libraries = arrayListOf<Library>()
        libraries.add(proseduralDoling)
        libraries.add(namaNamaTuhan)
        libraries.add(tujuhPerjanjian)
        libraries.add(pengertianTumen)
        libraries.add(layananMalaikat)

        database.insertLibrary(libraries, getLibraryDatabaseListener(), errorListener())
    }

    private fun getDatabaseSuccessListener(): DatabaseSuccessListener<Void> {
        return object : DatabaseSuccessListener<Void>() {
            override fun onSuccessResponse(results: Void?) {
                insertSpiritualWarfareVerseData()
            }
        }
    }

    private fun getSpiritualWarfareVerseDatabaseSuccessListener(): DatabaseSuccessListener<Void> {
        return object : DatabaseSuccessListener<Void>() {
            override fun onSuccessResponse(results: Void?) {
                insertShofarSoundData()
            }
        }
    }

    private fun getShofarSoundDatabaseListener(): DatabaseSuccessListener<Void> {
        return object : DatabaseSuccessListener<Void>() {
            override fun onSuccessResponse(results: Void?) {
                insertLibraryData()
            }
        }
    }

    private fun getLibraryDatabaseListener(): DatabaseSuccessListener<Void> {
        return object : DatabaseSuccessListener<Void>() {
            override fun onSuccessResponse(results: Void?) {
                UserConfiguration.getInstance().setCompleteFillData()
                openMainActivity()
            }
        }
    }

    private fun errorListener(): DatabaseErrorListener {
        return object : DatabaseErrorListener() {
            override fun onErrorResponseListener() {}
        }
    }

    private fun openMainActivity() {
        Handler(Looper.getMainLooper()).postDelayed(
            {
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
            },
            1000
        )
    }
}