fun main() {
    val dice = listOf("⚀", "⚁", "⚂", "⚃", "⚄", "⚅")
    
    mutableListOf<String>().apply { 
        while (add(dice.random()) && last() != "⚅") {} 
    }.let { rolls -> 
        println(rolls.joinToString(" ")) 
        println("#${rolls.size}") 
    }
}
