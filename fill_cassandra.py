import pandas as pd
import requests

# App,Category,Rating,Reviews,Size,Installs,Type,Price,Content Rating,Genres,Last Updated,Current Ver,Android Ver

data_file_name = 'googleplaystore.csv'
post_address = 'http://localhost:8080/api/v1/apps'

df = pd.read_csv(data_file_name)

for i in range(len(df)):
    
    request_json = {
        'appTitle': df.values[i][0],
        'category': df.values[i][1],
        'rating': df.values[i][2],
        'reviews': df.values[i][3],
        'size': df.values[i][4],
        'installs': df.values[i][5],
        'type': df.values[i][6],
        'price': df.values[i][7],
        'contentRating': df.values[i][8],
        'genres': df.values[i][9],
        'lastUpdate': df.values[i][10],
        'currentValue': df.values[i][11],
        'androidVer': df.values[i][12]
    }

    request = requests.post(post_address, json = request_json)
    if request.status_code != 200:
        print(i)
