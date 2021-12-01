# ParallelTestSelenoidTestNG
Paralell Test Execution with Selenoid

# Selenoid
install selenoid <br />
https://aerokube.com/selenoid/latest/ <br />

LATEST_BINARY_URL=`curl -s \
https://api.github.com/repos/aerokube/cm/releases/latest | \
grep "browser_download_url" | grep linux | cut -d : -f 2,3 | tr -d \"`  <br />
curl -L -o cm  $LATEST_BINARY_URL <br />
chmod +x ./cm <br />

# Run Selenoid:
sudo ./cm selenoid start <br />
sudo ./cm selenoid-ui start

# Run Project
mvn clean test <br />

allure reports: <br />
mvn allure:serve
