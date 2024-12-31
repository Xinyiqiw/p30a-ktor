package com.dignicate.p30a.domain.automobile

interface AutomobileRepository {
    fun getCompanies(limit: Int, page: Int): List<Company>
}

class MockAutomobileRepository : AutomobileRepository {
    override fun getCompanies(limit: Int, page: Int): List<Company> {
        // Mock data
        val allCompanies = listOf(
            Company(
                id = 1,
                name = listOf(
                    LocalizedString(language = "en", value = "Toyota"),
                    LocalizedString(language = "ja", value = "トヨタ")
                ),
                country = listOf(
                    LocalizedString(language = "en", value = "Japan"),
                    LocalizedString(language = "ja", value = "日本")
                ),
                foundedYear = 1937
            ),
            Company(
                id = 2,
                name = listOf(
                    LocalizedString(language = "en", value = "Ford"),
                    LocalizedString(language = "ja", value = "フォード")
                ),
                country = listOf(
                    LocalizedString(language = "en", value = "USA"),
                    LocalizedString(language = "ja", value = "アメリカ")
                ),
                foundedYear = 1903
            ),
            Company(
                id = 3,
                name = listOf(
                    LocalizedString(language = "en", value = "BMW"),
                    LocalizedString(language = "ja", value = "ビー・エム・ダブリュー")
                ),
                country = listOf(
                    LocalizedString(language = "en", value = "Germany"),
                    LocalizedString(language = "ja", value = "ドイツ")
                ),
                foundedYear = 1916
            ),
            Company(
                id = 4,
                name = listOf(
                    LocalizedString(language = "en", value = "Hyundai"),
                    LocalizedString(language = "ja", value = "ヒュンダイ"),
                    LocalizedString(language = "ko", value = "현대")
                ),
                country = listOf(
                    LocalizedString(language = "en", value = "South Korea"),
                    LocalizedString(language = "ja", value = "韓国"),
                    LocalizedString(language = "ko", value = "대한민국")
                ),
                foundedYear = 1967
            ),
            Company(
                id = 5,
                name = listOf(
                    LocalizedString(language = "en", value = "Fiat"),
                    LocalizedString(language = "ja", value = "フィアット"),
                    LocalizedString(language = "it", value = "Fiat")
                ),
                country = listOf(
                    LocalizedString(language = "en", value = "Italy"),
                    LocalizedString(language = "ja", value = "イタリア"),
                    LocalizedString(language = "it", value = "Italia")
                ),
                foundedYear = 1899
            ),
            Company(
                id = 6,
                name = listOf(
                    LocalizedString(language = "en", value = "Volvo"),
                    LocalizedString(language = "ja", value = "ボルボ"),
                    LocalizedString(language = "sv", value = "Volvo")
                ),
                country = listOf(
                    LocalizedString(language = "en", value = "Sweden"),
                    LocalizedString(language = "ja", value = "スウェーデン"),
                    LocalizedString(language = "sv", value = "Sverige")
                ),
                foundedYear = 1927
            ),
            Company(
                id = 7,
                name = listOf(
                    LocalizedString(language = "en", value = "Tata Motors"),
                    LocalizedString(language = "ja", value = "タタ・モーターズ"),
                    LocalizedString(language = "hi", value = "टाटा मोटर्स")
                ),
                country = listOf(
                    LocalizedString(language = "en", value = "India"),
                    LocalizedString(language = "ja", value = "インド"),
                    LocalizedString(language = "hi", value = "भारत")
                ),
                foundedYear = 1945
            ),
            Company(
                id = 8,
                name = listOf(
                    LocalizedString(language = "en", value = "Renault"),
                    LocalizedString(language = "ja", value = "ルノー"),
                    LocalizedString(language = "fr", value = "Renault")
                ),
                country = listOf(
                    LocalizedString(language = "en", value = "France"),
                    LocalizedString(language = "ja", value = "フランス"),
                    LocalizedString(language = "fr", value = "France")
                ),
                foundedYear = 1899
            ),
            Company(
                id = 9,
                name = listOf(
                    LocalizedString(language = "en", value = "Koenigsegg"),
                    LocalizedString(language = "ja", value = "ケーニグセグ")
                ),
                country = listOf(
                    LocalizedString(language = "en", value = "Sweden"),
                    LocalizedString(language = "ja", value = "スウェーデン")
                ),
                foundedYear = 1994
            ),
            Company(
                id = 10,
                name = listOf(
                    LocalizedString(language = "en", value = "Pagani"),
                    LocalizedString(language = "ja", value = "パガーニ"),
                    LocalizedString(language = "it", value = "Pagani")
                ),
                country = listOf(
                    LocalizedString(language = "en", value = "Italy"),
                    LocalizedString(language = "ja", value = "イタリア"),
                    LocalizedString(language = "it", value = "Italia")
                ),
                foundedYear = 1992
            ),
            Company(
                id = 11,
                name = listOf(
                    LocalizedString(language = "en", value = "Rimac"),
                    LocalizedString(language = "ja", value = "リマック"),
                    LocalizedString(language = "hr", value = "Rimac")
                ),
                country = listOf(
                    LocalizedString(language = "en", value = "Croatia"),
                    LocalizedString(language = "ja", value = "クロアチア"),
                    LocalizedString(language = "hr", value = "Hrvatska")
                ),
                foundedYear = 2009
            ),
            Company(
                id = 12,
                name = listOf(
                    LocalizedString(language = "en", value = "Zastava"),
                    LocalizedString(language = "ja", value = "ザスタバ"),
                    LocalizedString(language = "sr", value = "Застава")
                ),
                country = listOf(
                    LocalizedString(language = "en", value = "Serbia"),
                    LocalizedString(language = "ja", value = "セルビア"),
                    LocalizedString(language = "sr", value = "Србија")
                ),
                foundedYear = 1953
            ),
            Company(
                id = 13,
                name = listOf(
                    LocalizedString(language = "en", value = "Holden"),
                    LocalizedString(language = "ja", value = "ホールデン")
                ),
                country = listOf(
                    LocalizedString(language = "en", value = "Australia"),
                    LocalizedString(language = "ja", value = "オーストラリア")
                ),
                foundedYear = 1856
            ),
            Company(
                id = 14,
                name = listOf(
                    LocalizedString(language = "en", value = "Saab"),
                    LocalizedString(language = "ja", value = "サーブ")
                ),
                country = listOf(
                    LocalizedString(language = "en", value = "Sweden"),
                    LocalizedString(language = "ja", value = "スウェーデン")
                ),
                foundedYear = 1945
            ),
            Company(
                id = 15,
                name = listOf(
                    LocalizedString(language = "en", value = "Peugeot"),
                    LocalizedString(language = "ja", value = "プジョー"),
                    LocalizedString(language = "fr", value = "Peugeot")
                ),
                country = listOf(
                    LocalizedString(language = "en", value = "France"),
                    LocalizedString(language = "ja", value = "フランス"),
                    LocalizedString(language = "fr", value = "France")
                ),
                foundedYear = 1810
            )
        )
        // Simple paging
        return allCompanies.drop((page - 1) * limit).take(limit)
    }
}
