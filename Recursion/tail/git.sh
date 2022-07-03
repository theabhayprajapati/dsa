# take input for msg
read msg
# run this cmd
git add .
git commit -m "$msg"
git push 
# msg green color msg
echo -e "\e[32m"
echo "Commit and push done"
echo -e "\e[0m"
