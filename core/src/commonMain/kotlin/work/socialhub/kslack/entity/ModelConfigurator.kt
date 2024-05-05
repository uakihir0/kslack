package work.socialhub.kslack.entity

fun interface ModelConfigurator<Builder> {
    fun configure(builder: Builder): Builder
}
