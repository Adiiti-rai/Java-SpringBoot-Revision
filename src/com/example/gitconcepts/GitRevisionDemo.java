package com.example.gitconcepts;

public class GitRevisionDemo {
    public static void main(String[] args){
        System.out.println("This is the  git Revision demo");
    }
}
// 1. what is git-- git is a distributed version control system which is used to track changes in source
//code during software development.

//2. what is version control-> It is system that helps you track,manage and store changes to files over time.
 // why Version control system->
//1. Track changes(who changed what & when)
//2.Go back to previous version
//3. Multiple developers can work together
//4. backup of your code.

// Types of Version Control Systems-->
//1. Local Version Control System-->Version control stored codes only on your local machine
//2. Centralized Version Control System-->All code is stored in a central server
//3. Distributed Version Control System-->Every developer has a full copy of repository

// why git is  a distributed version control system-->
//1. Every developer has a full copy of repository
//2. No dependency on a central server
//3.Enables offline commits
//4.Faster collaboration

//Git Architecture/flow--> There are three main states in Git:
// 1.Working Directory-->Where you modify files
// 2.Staging Area-->Temporary area to prepare files before commit
// 3.Repository-->Stores committed changes permanently

//Commands-->

// how to check git is sucessfully installed--> git --version
//Configure git--> 1.local configuration(Apply only the current(specific)project)--> git config user.name "Your name"
//git config user.email "your email"
//2.Global configuration(Apply to all repository)-->
// git config --global user.name "Your name"
//git config --global user.email "your email"
// Why we need git config-->We need git config to set user identity (name & email) so Git can track who made each commit.
// Without configuration, Git cannot record author details and may not allow commits, so tracking and collaboration become difficult.

//git log--> to see the commit history
//git status--> to see the current status of your repository

//git init--> to initialize a new git repository or convert a folder into Git project.
//git add .(add all files) and git add filename(add specific file)--> add files to staging area
//git commit--> to save changes to repository with a message describing the changes
// git commit -m "initial commit"

//Branching and Merging--->
// Branch-->A branch is a separate line of development in Git.
//  why-->It allows you to work on different features or bug fixes without affecting the main codebase.
// You can create, switch, and merge branches to manage your code effectively.
// how to create a branch--> git branch branch_name
// how to switch to a branch--> git checkout branch_name
//how to create + switch branch together---> git checkout -b branch name
//--------------------------------------------
//Merge-->Merge combines changes from one branch into another.
// why--> It allows you to integrate changes from different branches,
// such as merging a feature branch into the main branch after development is complete.
// how to merge--> git merge branch_name--> so firstly go to the branch where you want to merge the changes and then run the above command to merge the changes from the specified branch.
//EG--> git checkout main and then git merge feature_branch
//------------------------------------------------
// Merge conflict-->A merge conflict occurs when:Same file, Same line,Modified differently in  branches.
//Conflict ka format--->
//<<<<<<< HEAD
//Login with email
//=======
//Login with phone
//>>>>>>> feature-login


//HEAD → (current branch (main))-->HEAD is a pointer that refers to the current branch or commit.
//feature-login → (merging branch)
// To resolve merge conflict-->
//1. Open the conflicting file and look for conflict markers (<<<<<<<, =======, >>>>>>>).
//2. Decide which changes to keep (either from HEAD or feature-login) or combine them manually.
//3. Remove the conflict markers after resolving the conflict.
//Conflict resolve = Edit file manually → remove markers → add → commit

// how to resolve merge conflict-->working with remote repositories-->
//Remote-->code stored on the server like Github, GitLab, Bitbucket
//Clone repository-> creates a copy of a remote repository on your local machine.
// how to clone repository--> git clone repository_url
//Add remote repository--> git remote add origin repository_url
//Push changes--> git push origin branch_name
//Pull changes--> git pull origin branch_name
//Pull Request-->Pull Request is a request to merge your code changes from one branch into another branch.
//Pull Request = Code review + merge approval process
//Why we use Pull Request?
// Code review by team members
// Find bugs before merging
// Safe collaboration
// Maintain code quality
//When to use?--->
//After completing a feature or bug fix
//Before merging code into main or develop
// Always use pull before pushing to avoid conflicts.


//----------------------------------
//git stash-->git stash is a command that allows you to temporarily save changes that are not ready to be committed.
// It is useful when you want to switch branches or work on something else without committing your current changes.
// git stash
//git stash pop--> to apply the stashed changes back to your working directory and remove them from the stash list.
// git reset-->undo commits
//git rebase-->Reapply commits on top of another branch
//git diff-->Show changes between commits, branches, or working directory
// git squash-->Combine multiple commits into one commit
// It is Used to keep a clean and readable commit history
//git revert--> It is Used to undo a commit by creating a new commit
// Safe because it does not delete history
//git revert <commit_id>
//git tag-->Used to assign a label/name to a specific commit.

// cherry-pick--> It is used to pick a specific commit from one branch and apply it to another branch.
//git cherry-pick<commit_id>
//why we need cherry-pic-->
//We use git cherry-pick to apply a specific commit (like a bug fix) to another branch without merging the whole branch.
// It helps when you need only selected changes, not all changes from a branch

//git amend---> is used to modify the last commit.
// git commit --amend