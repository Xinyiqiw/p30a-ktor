package com.dignicate.p30a.domain.automobile

interface AutomobileRepository {
    fun getCompanies(limit: Int, page: Int): List<Company>
}

class MockAutomobileRepository : AutomobileRepository {
    override fun getCompanies(limit: Int, page: Int): List<Company> {
        // モックデータ
        val allCompanies = listOf(
            Company(1, "Toyota", "Japan", 1937),
            Company(2, "Ford", "USA", 1903),
            Company(3, "BMW", "Germany", 1916),
            // その他のデータ
        )
        // ページング処理（簡易）
        return allCompanies.drop((page - 1) * limit).take(limit)
    }
}
