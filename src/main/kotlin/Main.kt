class Database(var databaseName: String) {


    companion object {
        private var db: Database? = null


        fun getInstance() : Database {
            if(db != null) {
                return db!!
            } else {
                db = Database(databaseName = "mydb")
                return db!!
            }
        }
    }
}

fun main() {
    var database1: Database = Database.getInstance()
    var database2: Database = Database.getInstance()


    println(database1)
    println(database2)


}