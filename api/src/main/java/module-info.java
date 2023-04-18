import io.github.nathensample.creek.connect.services.api.CreekConnectServicesAggregateDescriptor;
import org.creekservice.api.platform.metadata.ComponentDescriptor;

module creek.connect.services.api {
    requires transitive creek.kafka.metadata;

    exports io.github.nathensample.creek.connect.services.api;
    exports io.github.nathensample.creek.connect.services.internal to
            creek.connect.services.services,
            creek.connect.services.service;

    provides ComponentDescriptor with
            CreekConnectServicesAggregateDescriptor;
}
