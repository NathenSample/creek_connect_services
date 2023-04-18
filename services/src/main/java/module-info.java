import io.github.nathensample.creek.connect.services.services.HandleOccurrenceServiceDescriptor;
import org.creekservice.api.platform.metadata.ComponentDescriptor;

module creek.connect.services.services {
    requires transitive creek.connect.services.api;

    exports io.github.nathensample.creek.connect.services.services;

    provides ComponentDescriptor with
            HandleOccurrenceServiceDescriptor;
}
