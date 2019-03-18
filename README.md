# SampleTrainingProjects
This project is part of the MasterCard code challange .

Challange Description below:
Two cities are considered connected if there’s a series of roads that can be traveled from one city to another.
List of roads is available in a file called as city.txt which is placed under C drive of this computer. Note that this could be placed anywhere on the
server Or cloud .
File contains a list of city pairs (one pair per line, comma separated), which indicates that there’s a road between those cities.

Spring-boot app will be deployed and below URL will be exposed :

http://localhost:8080/connected?origin=city1&destination=city2


Application will respond with ‘yes’ if city1 is connected to city2, ’no’ if city1 is not connected to city2.

Any unexpected input should result in a ’no’ response.
Example:
city.txt content is:
Boston, New York
Philadelphia, Newark
Newark, Boston
Trenton, Albany

