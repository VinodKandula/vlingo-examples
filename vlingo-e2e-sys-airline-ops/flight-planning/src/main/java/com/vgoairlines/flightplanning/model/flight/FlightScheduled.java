package com.vgoairlines.flightplanning.model.flight;

import io.vlingo.common.version.SemanticVersion;
import io.vlingo.lattice.model.IdentifiedDomainEvent;

import java.util.UUID;

public final class FlightScheduled extends IdentifiedDomainEvent {

  private final UUID eventId;
  public final String id;
  public final AircraftId aircraftId;
  public final Schedule schedule;

  public FlightScheduled(final FlightState state) {
    super(SemanticVersion.from("0.0.1").toValue());
    this.id = state.id;
    this.aircraftId = state.aircraftId;
    this.schedule = state.schedule;
    this.eventId = UUID.randomUUID(); //TODO: Define the event id
  }

  @Override
  public String identity() {
    return eventId.toString();
  }
}