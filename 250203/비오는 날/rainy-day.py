class Forecast:
    def __init__(self, date, day, weather):
        self.date = date
        self.day = day
        self.weather = weather

n = int(input())

forecast = []
for _ in range(n):
    date, day, weather = input().split()
    forecast.append(Forecast(date, day, weather))

forecast = sorted(forecast, key=lambda x: x.date)
for i in range(len(forecast)):
    if forecast[i].weather == "Rain":
        print(forecast[i].date, forecast[i].day, forecast[i].weather)
        break