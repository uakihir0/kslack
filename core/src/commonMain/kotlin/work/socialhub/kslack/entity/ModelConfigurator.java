package work.socialhub.kslack.entity;

@FunctionalInterface
public interface ModelConfigurator<Builder> {

    Builder configure(Builder builder);

}
