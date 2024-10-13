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
                name = LocalizedString(en = "Toyota", ja = "トヨタ"),
                country = LocalizedString(en = "Japan", ja = "日本"),
                foundedYear = 1937
            ),
            Company(
                id = 2,
                name = LocalizedString(en = "Ford", ja = "フォード"),
                country = LocalizedString(en = "USA", ja = "アメリカ"),
                foundedYear = 1903
            ),
            Company(
                id = 3,
                name = LocalizedString(en = "BMW", ja = "ビー・エム・ダブリュー"),
                country = LocalizedString(en = "Germany", ja = "ドイツ"),
                foundedYear = 1916
            ),
            Company(
                id = 4,
                name = LocalizedString(en = "Hyundai", ja = "ヒュンダイ"),
                country = LocalizedString(en = "South Korea", ja = "韓国"),
                foundedYear = 1967
            ),
            Company(
                id = 5,
                name = LocalizedString(en = "Fiat", ja = "フィアット"),
                country = LocalizedString(en = "Italy", ja = "イタリア"),
                foundedYear = 1899
            ),
            Company(
                id = 6,
                name = LocalizedString(en = "Volvo", ja = "ボルボ"),
                country = LocalizedString(en = "Sweden", ja = "スウェーデン"),
                foundedYear = 1927
            ),
            Company(
                id = 7,
                name = LocalizedString(en = "Tata Motors", ja = "タタ・モーターズ"),
                country = LocalizedString(en = "India", ja = "インド"),
                foundedYear = 1945
            ),
            Company(
                id = 8,
                name = LocalizedString(en = "Renault", ja = "ルノー"),
                country = LocalizedString(en = "France", ja = "フランス"),
                foundedYear = 1899
            ),
            Company(
                id = 9,
                name = LocalizedString(en = "Koenigsegg", ja = "ケーニグセグ"),
                country = LocalizedString(en = "Sweden", ja = "スウェーデン"),
                foundedYear = 1994
            ),
            Company(
                id = 10,
                name = LocalizedString(en = "Pagani", ja = "パガーニ"),
                country = LocalizedString(en = "Italy", ja = "イタリア"),
                foundedYear = 1992
            ),
            Company(
                id = 11,
                name = LocalizedString(en = "Rimac", ja = "リマック"),
                country = LocalizedString(en = "Croatia", ja = "クロアチア"),
                foundedYear = 2009
            ),
            Company(
                id = 12,
                name = LocalizedString(en = "Zastava", ja = "ザスタバ"),
                country = LocalizedString(en = "Serbia", ja = "セルビア"),
                foundedYear = 1953
            ),
            Company(
                id = 13,
                name = LocalizedString(en = "Holden", ja = "ホールデン"),
                country = LocalizedString(en = "Australia", ja = "オーストラリア"),
                foundedYear = 1856
            ),
            Company(
                id = 14,
                name = LocalizedString(en = "Saab", ja = "サーブ"),
                country = LocalizedString(en = "Sweden", ja = "スウェーデン"),
                foundedYear = 1945
            ),
            Company(
                id = 15,
                name = LocalizedString(en = "Peugeot", ja = "プジョー"),
                country = LocalizedString(en = "France", ja = "フランス"),
                foundedYear = 1810
            )
        )
        // Simple paging
        return allCompanies.drop((page - 1) * limit).take(limit)
    }
}
