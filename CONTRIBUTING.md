# smart-traffic

---

## 🌿 Git Branching Strategy (Git Flow)

* **`main`** — Production-ready branch for stable releases and demos. Direct pushes are blocked.
* **`feature/short-name`** — Working branches for Jira tasks (e.g., `feature/ui-create-road`).
* **`fix/short-name`** — Working branches for bug fixes.

---

## 🚀 Step-by-Step Git Workflow

### 1. Start a New Task
Always pull the latest changes from `main` before creating your branch:
```bash
git checkout main
git pull origin main
git checkout -b feature/task-title
```

### 2. Commit Your Changes

  ```bash
  git add .
  git commit -m "feat(ui): create feature"
  ```

### 3. Update & Open a Pull Request (PR)
Before pushing, sync your branch with `main` to avoid merge conflicts:
```bash
git checkout main
git pull origin main
git checkout feature/task-title
git merge main
git push -u origin feature/task-title
```
* Go to GitHub and open a **Pull Request into `main`**.
* Use **Squash and merge** when merging your PR.
