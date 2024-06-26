/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.54).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.model.Event;
import io.swagger.model.EventIdApprovalBody;
import io.swagger.model.Item;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.bind.annotation.CookieValue;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-04-06T17:20:40.188024470Z[GMT]")
@Validated
public interface EventsApi {

    @Operation(summary = "Approve or reject an event", description = "", tags={ "Event Management" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Event updated"),
        
        @ApiResponse(responseCode = "404", description = "Event not found") })
    @RequestMapping(value = "/events/{eventId}/approval",
        consumes = { "application/json" }, 
        method = RequestMethod.PUT)
    ResponseEntity<Void> eventsEventIdApprovalPut(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("eventId") Integer eventId
, @Parameter(in = ParameterIn.DEFAULT, description = "", required=true, schema=@Schema()) @Valid @RequestBody EventIdApprovalBody body
);


    @Operation(summary = "Get all items for an event", description = "", tags={ "Inventory Management" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "An array of items", content = @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = Item.class)))),
        
        @ApiResponse(responseCode = "404", description = "Event not found") })
    @RequestMapping(value = "/events/{eventId}/items",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<Item>> eventsEventIdItemsGet(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("eventId") Integer eventId
);


    @Operation(summary = "Delete an item from inventory", description = "", tags={ "Inventory Management" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "204", description = "Item deleted"),
        
        @ApiResponse(responseCode = "404", description = "Item not found") })
    @RequestMapping(value = "/events/{eventId}/items/{itemId}",
        method = RequestMethod.DELETE)
    ResponseEntity<Void> eventsEventIdItemsItemIdDelete(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("eventId") Integer eventId
, @Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("itemId") Integer itemId
);


    @Operation(summary = "Edit an item in inventory", description = "", tags={ "Inventory Management" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Item updated"),
        
        @ApiResponse(responseCode = "404", description = "Item not found") })
    @RequestMapping(value = "/events/{eventId}/items/{itemId}",
        consumes = { "application/json" }, 
        method = RequestMethod.PUT)
    ResponseEntity<Void> eventsEventIdItemsItemIdPut(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("eventId") Integer eventId
, @Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("itemId") Integer itemId
, @Parameter(in = ParameterIn.DEFAULT, description = "", required=true, schema=@Schema()) @Valid @RequestBody Item body
);


    @Operation(summary = "Add an item to inventory", description = "", tags={ "Inventory Management" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "201", description = "Item added"),
        
        @ApiResponse(responseCode = "400", description = "Invalid input") })
    @RequestMapping(value = "/events/{eventId}/items",
        consumes = { "application/json" }, 
        method = RequestMethod.POST)
    ResponseEntity<Void> eventsEventIdItemsPost(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("eventId") Integer eventId
, @Parameter(in = ParameterIn.DEFAULT, description = "", required=true, schema=@Schema()) @Valid @RequestBody Item body
);


    @Operation(summary = "Get all events", description = "", tags={ "Event Management" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "An array of events", content = @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = Event.class)))) })
    @RequestMapping(value = "/events",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<Event>> eventsGet();

    @Operation(summary = "Get an event by ID", description = "", tags={ "Event Management" })
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "Event found", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Event.class))),

        @ApiResponse(responseCode = "404", description = "Event not found") })
    @RequestMapping(value = "/events/{eventId}",
        produces = { "application/json" },
        method = RequestMethod.GET)
    ResponseEntity<Event> eventsEventIdGet(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("eventId") Integer eventId
);

    @Operation(summary = "Delete an event", description = "", tags={ "Event Management" })
    @ApiResponses(value = {
        @ApiResponse(responseCode = "204", description = "Event deleted"),

        @ApiResponse(responseCode = "404", description = "Event not found") })
    @RequestMapping(value = "/events/{eventId}",
        method = RequestMethod.DELETE)
    ResponseEntity<Void> eventsEventIdDelete(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("eventId") Integer eventId
);

    @Operation(summary = "Edit an event", description = "", tags={ "Event Management" })
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "Event updated"),

        @ApiResponse(responseCode = "404", description = "Event not found") })
    @RequestMapping(value = "/events/{eventId}",
        consumes = { "application/json" },
        method = RequestMethod.PUT)
    ResponseEntity<Void> eventsEventIdPut(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("eventId") Integer eventId
, @Parameter(in = ParameterIn.DEFAULT, description = "", required=true, schema=@Schema()) @Valid @RequestBody Event body
);


    @Operation(summary = "Create an event", description = "", tags={ "Event Management" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "201", description = "Event created"),
        
        @ApiResponse(responseCode = "400", description = "Invalid input") })
    @RequestMapping(value = "/events",
        consumes = { "application/json" }, 
        method = RequestMethod.POST)
    ResponseEntity<Void> eventsPost(@Parameter(in = ParameterIn.DEFAULT, description = "", required=true, schema=@Schema()) @Valid @RequestBody Event body
);

}

