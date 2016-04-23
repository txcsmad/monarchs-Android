# UT Monarchs (Android)

## Project Defaults
 * Official IDE is Android Studio.

## Workflow

### Rules
 * All substantial development should have a Github issue for it, assigned to the person that is
 doing the work, for coordination.  (Small changes like typo fixes and improvements that don't
 modify existing app functionality can go straight to a pull request)
 * All development is done in branches off of develop.
 * When develop is stable (bugs fixed, well tested, etc.), it can be merged into master.
 * All pull requests should be reviewed by at least one person (two if team sizes increase past 2-3 people).
 This is designed to catch mistakes before they get merged into master.
 * Only the reviewer should merge the changes into develop, and only after these changes are approved.
 * Never comment on a commit, we'll lose those comments whenever the commit is amended.  Always comment on the diff ("files changed" tab).
 * __PLEASE DON'T__ push to master or develop. Changes to these branches should only be done via pull requests.

### Flow (Recommended - Basic Git Flow)
1. Requester finds the issue number that refers to this feature/bug/etc.
2. Requester makes the name of their branch the issue type with issue number followed by a super short description of the issue, such as `feature/1-create-readme`.
3. Requester squashes their commits down to a small number of commits for disparate pieces of functionality.
4. Requester ensures that the commit message is short and useful.  The first line should be a one
sentence summary of changes, and additional details should be in the rest of the commit.  Leave a
blank line between the title and the description.
5. Requester reads over the entire commit and makes sure that the commit is both tidy and an
improvement over the previous iteration of the code.  The commit should only touch code that is
relevant to the issue: if there's something else to fix, make a new pull request for it.
6. Requester creates the pull request and tags reviewers that are familiar with this area of the
code in a comment, so that these reviewers are notified that there's a commit ready for them to review.
7. Reviewers look at the proposed changes (by using and add feedback line-by-line in the diff view
("files changed" tab-- if you comment on a commit, that comment will be lost as soon as the commit is amended).
8. Requester addresses feedback by amending changes into the relevant commit, such that a "better
version" of this commit is kept.  The requester then force-pushes these new commits onto the pull
request branch in order to update the pull request.
9. This feedback-change cycle iterates a couple of times until a well-formed pull request emerges.
10. If approved, the reviewer merges the pull request into master and then deletes the branch.
11. If declined, reviewers should note why the pull request should be declined but not necessarily
close it.  The requester should close the pull request and delete the branch (unless it makes sense to keep the branch around).


## Tips

 * Don't use `Log` methods like `Log.d`, instead use Timber