class Agent:
    def __init__(self, code, score):
        self.code = code
        self.score = score

agents = []
for _ in range(5):
    code, score = input().split()
    score = int(score)
    agents.append(Agent(code, score))

agents = sorted(agents, key=lambda x: x.score)
print(agents[0].code, agents[0].score)