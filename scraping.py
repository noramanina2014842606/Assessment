from bs4 import BeautifulSoup
import request
from urllib.requests import urlopen

html = urlopen("http://fskm.uitm.edu.my/v1/fakulti/staff-directory/academic/1097.html")
bdObj = BeautifulSoup(html.read())
print(html.read())
