Scenario:
You’re building a Java tool that analyzes a gamer’s performance in an online match and predicts if they’ll rage quit, keep grinding, or smash their keyboard.

📥 Input:
kills (int) – number of kills in the match

deaths (int) – number of times they died

teamCommunication (boolean) – did they talk to the team or stay muted?

gotTrolledByTeammates (boolean) – were they trolled by teammates?

💻 Logic:
KD Ratio (kill/death):

If KD ≥ 2 → "Godlike"

If KD between 1 and 2 → "Decent"

If KD < 1 → "Pain"

Mood Prediction:

If KD < 1 AND got trolled → Rage Quit

If KD ≥ 1 AND communication is true → Keep Grinding

Else → Keyboard Smash

Ternary Tag (emoji style):

Rage Quit → "💢 Rage Quit Incoming"

Keep Grinding → "🔥 Focused Gamer"

Keyboard Smash → "🧨 RIP Keyboard"


Output

Kills: 3  
Deaths: 5  
Team Communication: false  
Got Trolled: true  

KD Ratio: Pain  
Mood: Rage Quit  
Tag: 💢 Rage Quit Incoming  
