# Use the latest Open Liberty image with Java 21 and OpenJ9
FROM openliberty/open-liberty:latest
# Copy your Spring Boot WAR into Liberty's dropins folder
COPY target/my-java-app-2.5.6.war /config/dropins/

# Expose Liberty default HTTP port
EXPOSE 9080

# Start the Liberty server
CMD ["server", "run", "defaultServer"]