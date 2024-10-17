package com.closedsource.psymed.platform.appointmentandadministration.domain.model.queries;

/**
 * Query to get a specific appointment by its ID.
 * @param appointmentId The unique ID of the appointment.
 */
public record GetAppointmentByIdQuery(Long appointmentId) {
    public GetAppointmentByIdQuery {
        if (appointmentId == null || appointmentId <= 0) {
            throw new IllegalArgumentException("appointmentId cannot be null or less than or equal to 0");
        }
    }
}
