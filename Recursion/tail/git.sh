

git add .
git commit -m "$1"
git push 
# msg green color msg
echo -e "\e[32m"
echo "Commit and push done "
echo -e "\e[0m"
# in blue
echo -e "\e[34m"
echo "Now you can go to github.com and see your changes"

