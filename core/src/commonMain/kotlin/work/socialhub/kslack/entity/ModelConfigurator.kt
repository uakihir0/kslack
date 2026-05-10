package work.socialhub.kslack.entity

/**
 * Functional interface for configuring model builder instances.
 *
 * Provides a fluent way to apply configuration transformations to
 * builder objects during model construction. Used with Block Kit
 * compositions and other builder-pattern models.
 *
 * @param Builder The type of builder being configured
 */
fun interface ModelConfigurator<Builder> {
    fun configure(builder: Builder): Builder
}
